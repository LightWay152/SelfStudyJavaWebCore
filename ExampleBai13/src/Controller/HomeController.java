package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Province;
import BEAN.Student;
import DAO.HomeDAO;
import DB.DbConnection;

import java.sql.*;
import java.util.List;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Connection conn = DbConnection.CreateConnection();
		
		String studentname = request.getParameter("studentname");
		String provinceidstr = request.getParameter("dropdownprovince");
		
		int provinceid = Integer.parseInt(provinceidstr);
		
		Student student = new Student();
		student.setStudentname(studentname);
		student.setProvinceid(provinceid);
		
		boolean kt = HomeDAO.InsertStudent(conn, student);
		
		if(kt){			
			try {
				request.setAttribute("msginsertstudent", "Insert Success!");
				
				List<Province> list = HomeDAO.DisplayProvince(conn);
				
				request.setAttribute("listprovince", list);
				
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
				rd.forward(request, response);
				
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			request.setAttribute("msginsertstudent", "Insert Failed!");
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}
		
	}

}
