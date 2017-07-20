package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Comment;
import DAO.CommentDAO;
import DB.DbConnection;

@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CommentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		if(request.getCharacterEncoding()!=null){
			request.setCharacterEncoding("UTF-8");
		}
		
		try {
			String content = request.getParameter("content");
			String username = request.getParameter("username");
			Connection conn = DbConnection.CreateConnection();
			
			Comment cmt = new Comment();
			cmt.setContent(content);
			cmt.setUsername(username);
			
			CommentDAO.Insertcomment(conn, cmt);
			
			List<Comment> list = CommentDAO.Displaycomment(conn);
			
			request.setAttribute("listcomment", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("View/Displaycomment.jsp");
			rd.forward(request, response);
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
