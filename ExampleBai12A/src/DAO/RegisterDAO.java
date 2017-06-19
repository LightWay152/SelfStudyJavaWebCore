package DAO;

import java.sql.*;

import BEAN.Account;

public class RegisterDAO {

	public static boolean InsertAccount(Connection conn, Account acc){
		
		PreparedStatement ptmt = null;
		
		String sql = "insert into account(uname,pass) values(?,?)";
				
		try{
			ptmt = conn.prepareStatement(sql);
			
			String uname = acc.getUname();
			String pass = acc.getPass();
			
			ptmt.setString(1, uname);
			ptmt.setString(2, pass);
			
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
