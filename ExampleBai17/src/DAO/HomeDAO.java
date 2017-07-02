package DAO;

import java.util.*;
import java.sql.*;

import BEAN.Emp;

public class HomeDAO {
	
	public static List<Emp> DisplayEmp(int start, int count, Connection conn){
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select * from emp limit "+(start-1)+", "+count+"";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()){
				Emp emp = new Emp();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				float salary = rs.getFloat("salary");
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static int CountRow(Connection conn){
		int count=0;

		String sql = "select count(*) from emp";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			rs.next();
			count=rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
}
