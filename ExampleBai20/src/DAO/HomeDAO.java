package DAO;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import BEAN.Users;

public class HomeDAO {
	public static void ImportExcel(HttpServletRequest request, HttpServletResponse response, Connection conn) throws ServletException, IOException{
		FileInputStream inp;
		 try {
			 inp = new FileInputStream("E://WorkSpace//JavaWebJSPServletCore//BackupDatabase//test.xls");
			 HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));		 
			 Sheet sheet = wb.getSheetAt(0);
			 
			 for(int i=1;i<=sheet.getLastRowNum();i++){
				 Row row = sheet.getRow(i);
				 int stt = (int) row.getCell(0).getNumericCellValue();
				 String name = row.getCell(1).getStringCellValue();
				 int pass = (int) row.getCell(2).getNumericCellValue();
				 
				 Users users = new Users();
				 users.setStt(stt);
				 users.setName(name);
				 users.setPass(pass);
				 
				 HomeDAO.InsertData(request, users, conn);
			 }
			 
			 wb.close();		 
		} catch (IOException e) {
			request.setAttribute("message", e.getMessage());
		}
		 
		 RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		 rd.forward(request, response);
	}
	
	public static void InsertData(HttpServletRequest request, Users users, Connection conn){
		String sql = "insert into account(stt,name,pass) values(?,?,?)";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, users.getStt());
			ptmt.setString(2, users.getName());
			ptmt.setInt(3, users.getPass());
			
			int kt = ptmt.executeUpdate();
			
			if(kt!=0){
				request.setAttribute("message", "Insert data from excel to mysql success!");
			}else{
				request.setAttribute("message", "Insert data from excel to mysql failed!");
			}
			
			ptmt.close();
		} catch (SQLException e) {
			request.setAttribute("message", e.getMessage());
		}
	}
}
