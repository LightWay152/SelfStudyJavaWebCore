package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean check = LoginDAO.Validate(password);
		if(check)
		{
			//Create new session
			HttpSession session=request.getSession(true);
			//Save session
			session.setAttribute("sessionusername", username);
			//Forward to Home.jsp page
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Login Failed");
			//Load Login.jsp page again
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);
		}
	}

}
