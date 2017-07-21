package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import BEAN.Employee;

public class SearchDAO {
	public static List<Employee> Displayresult(HttpServletRequest request,Connection conn,String name1){
		
		List<Employee> list = new ArrayList<Employee>();	
		String sql = "select * from employee where name like '"+name1+"%'";
		
		try {	
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			if(!rs.isBeforeFirst()){
				request.setAttribute("ketqua", "Not found result!");
			}
			else{
				while(rs.next()){
					Employee emp = new Employee();
					
					String name = rs.getString("name");					
					emp.setName(name);	
					
					list.add(emp);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;	
	}
}
