package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.AnswerUser;
import BEAN.IncompleteSentenced;
import DAO.QuizDAO;
import DB.DbConnection;
import java.sql.*;
import java.util.*;

@WebServlet("/QuizController")
public class QuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QuizController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Connection conn = DbConnection.CreateConnection();
		int countRow = QuizDAO.GetCountRow(conn);	
		List<IncompleteSentenced> listcorrectanswer = QuizDAO.GetCorrectAnswer(conn);
		List<AnswerUser> listansweruser = new ArrayList<AnswerUser>();
		
		for(int i=1;i<=countRow;i++){
			String answer = request.getParameter("ans["+i+"]");
			if(answer != null){
				AnswerUser au = new AnswerUser();
				au.setNumber(i);
				au.setAnswer(answer);
				listansweruser.add(au);
			}
			else{
				request.setAttribute("msg", "Please answer all of questions!");
				
				List<IncompleteSentenced> list = QuizDAO.DisplayQuestion(conn);
				request.setAttribute("listincomplete", list);
				
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
				rd.forward(request, response);
			}
		}
		
		request.setAttribute("listcorrectanswer", listcorrectanswer);
		request.setAttribute("listansweruser", listansweruser);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Result.jsp");
		rd.forward(request, response);
	}

}
