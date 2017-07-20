package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.Comment;

public class CommentDAO {
	
	//insert comment into mysql
	public static void Insertcomment(Connection conn, Comment cmt){
			
			PreparedStatement ptmt = null;
			
			String sql = "insert into comment(content,username) values(?,?)";
					
			try{
				ptmt = conn.prepareStatement(sql);
				
				String content = cmt.getContent();
				String username = cmt.getUsername();
				
				ptmt.setString(1, content);
				ptmt.setString(2, username);
				
				ptmt.executeUpdate();			
				ptmt.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	
	//select comment from mysql
	public static List<Comment> Displaycomment(Connection conn){
		
		List<Comment> list = new ArrayList<Comment>();	
		String sql = "select * from comment";
		
		try {	
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()){
				Comment cmt = new Comment();
				String content = rs.getString("content");
				String username = rs.getString("username");
				
				cmt.setContent(content);
				cmt.setUsername(username);
				
				list.add(cmt);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;	
	}

}
