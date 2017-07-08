package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Account;
import DAO.RegisterDAO;
import DB.DbConnection;

import java.sql.*;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterController() {
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
		Connection conn = DbConnection.CreateConnection();
		
		if(request.getCharacterEncoding()==null){
			request.setCharacterEncoding("UTF-8");
		}
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Account acc = new Account();
		acc.setUname(uname);
		acc.setPass(pass);
		
		boolean kt = RegisterDAO.InsertAccount(conn, acc);
		if(kt){			
			try {
				request.setAttribute("msgRegister", "Register Successfully!");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
				rd.forward(request, response);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			request.setAttribute("msgRegister", "Register Failed!");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
			rd.forward(request, response);
		}
		
	}

}
