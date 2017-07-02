package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Emp;
import DAO.HomeDAO;
import DB.DbConnection;

import java.util.*;
import java.sql.*;

@WebServlet("/HomeForward")
public class HomeForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeForward() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String pageidstr = request.getParameter("pageid");
		
		//Convert string to int for pageidstr
		int pageid = Integer.parseInt(pageidstr); 
		
		//Number of element per one page
		int count = 4;
		
		//If pageid = 1 => not paging
		//Else pageid !=1 => paging
		if(pageid==1){
			
		}else{
			pageid = pageid-1;
			pageid = pageid*count+1;
		}
		
		Connection conn = DbConnection.CreateConnection();
		List<Emp> list = HomeDAO.DisplayEmp(pageid, count, conn);
		
		int sumrow = HomeDAO.CountRow(conn);
		int maxpageid = (sumrow/count)+1;
		request.setAttribute("maxpageid", maxpageid);
		
		request.setAttribute("listemp", list);
		request.setAttribute("numberpage", Integer.parseInt(pageidstr));
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
