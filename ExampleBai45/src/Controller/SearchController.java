package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Employee;
import DAO.SearchDAO;
import DB.DbConnection;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Connection conn = DbConnection.CreateConnection();
		String name = request.getParameter("name");
		
		List<Employee> list = SearchDAO.Displayresult(request, conn, name);
		//SearchDAO.Displayresult(request, conn, name);
		
		request.setAttribute("listemp",list);
		
		RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		rd.forward(request, response);
	}

}
