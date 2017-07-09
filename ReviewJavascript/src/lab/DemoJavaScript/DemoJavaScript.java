package lab.DemoJavaScript;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoJavaScript")
public class DemoJavaScript extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoJavaScript() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		
		request.setAttribute("username", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	}

}
