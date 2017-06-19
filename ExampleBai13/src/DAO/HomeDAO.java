package DAO;

import java.util.*;

import BEAN.Province;
import BEAN.Student;

import java.sql.*;

public class HomeDAO {
	
	public static List<Province> DisplayProvince(Connection conn){
		
		List<Province> list = new ArrayList<Province>();	
		String sql = "select * from Province";
		
		try {	
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()){
				Province province = new Province();
				int provinceid = rs.getInt("provinceid");
				String provincename = rs.getString("provincename");
				
				province.setProvinceid(provinceid);
				province.setProvincename(provincename);
				
				list.add(province);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;	
	}
	
public static boolean InsertStudent(Connection conn, Student stt){
		
		PreparedStatement ptmt = null;
		
		String sql = "insert into student(studentname,provinceid) values(?,?)";
				
		try{
			ptmt = conn.prepareStatement(sql);
			
			String studentname = stt.getStudentname();
			int provinceid = stt.getProvinceid();
			
			ptmt.setString(1, studentname);
			ptmt.setInt(2, provinceid);
			
			int kt = ptmt.executeUpdate();
			
			if(kt != 0){
				return true;
			}
			
			ptmt.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;
		
	}
	
}
