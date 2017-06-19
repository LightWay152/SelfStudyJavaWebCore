package DAO;

import java.sql.*;
import java.util.*;

import BEAN.Account;

public class HomeDAO {
	
	public static List<Account> DisplayAccount(Connection conn){
		
		List<Account> list = new ArrayList<Account>();
		
		PreparedStatement ptmt = null;
		
		String sql = "select * from account";
				
		try{
			ptmt = conn.prepareStatement(sql);
			
			ResultSet rs = ptmt.executeQuery();
					
			while(rs.next()){
				Account acc = new Account();
				
				String uname = rs.getString("uname");
				String pass = rs.getString("pass");
				
				acc.setUname(uname);
				acc.setPass(pass);
				
				list.add(acc);
				
			}
			
			ptmt.close();
			rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
