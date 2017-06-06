package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Users;
import DAO.LoginDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Users users=new Users();
		users.setUsername(username);
		users.setPassword(password);
		
		boolean kt=LoginDAO.Validate(username, password);
		if(kt==true)
		{
			String msg1="Login Success";
			request.setAttribute("message1", msg1);
			
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/LoginSuccess.jsp");
			rd.forward(request, response);			
		}
		else
		{
			String msg2="Login Failed";
			request.setAttribute("message2", msg2);
			
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);	
		}
	}

}
