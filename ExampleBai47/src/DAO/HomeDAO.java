package DAO;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import BEAN.Dethi;

public class HomeDAO {
	public static void ImportExcel(HttpServletRequest request, HttpServletResponse response, Connection conn) throws ServletException, IOException{
		FileInputStream inp;
		 try {
			 inp = new FileInputStream("E://WorkSpace//JavaWebJSPServletCore//BackupDatabase//vidubai47.xls");
			 HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));		 
			 Sheet sheet = wb.getSheetAt(0);
			 
			 for(int i=1;i<=sheet.getLastRowNum();i++){
				 Row row = sheet.getRow(i);
				 int stt = (int) row.getCell(0).getNumericCellValue();
				 
				 String cauhoi = row.getCell(1).getStringCellValue();
				 
				 String dapan1 = row.getCell(2).getStringCellValue();
				 String dapan2 = row.getCell(3).getStringCellValue();
				 String dapan3 = row.getCell(4).getStringCellValue();
				 String dapan4 = row.getCell(5).getStringCellValue();
				 
				 Dethi dethi = new Dethi();
				 dethi.setStt(stt);
				 dethi.setCauhoi(cauhoi);
				 dethi.setDapan1(dapan1);
				 dethi.setDapan2(dapan2);
				 dethi.setDapan3(dapan3);
				 dethi.setDapan4(dapan4);
				 
				 HomeDAO.InsertData(request, dethi, conn);
			 }
			 
			 wb.close();		 
		} catch (IOException e) {
			request.setAttribute("message", e.getMessage());
		}

	}
	
	public static void InsertData(HttpServletRequest request, Dethi dethi, Connection conn){
		String sql = "insert into dethi(stt,cauhoi,dapan1,dapan2,dapan3,dapan4) values(?,?,?,?,?,?)";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, dethi.getStt());
			ptmt.setString(2, dethi.getCauhoi());
			ptmt.setString(3, dethi.getDapan1());
			ptmt.setString(4, dethi.getDapan2());
			ptmt.setString(5, dethi.getDapan3());
			ptmt.setString(6, dethi.getDapan4());
			
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
	
	public static List<Dethi> Displayexam(Connection conn){
		
		List<Dethi> list = new ArrayList<Dethi>();	
		String sql = "select * from dethi";
		
		try {	
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()){
				Dethi dethi = new Dethi();
								
				dethi.setStt(rs.getInt("stt"));	
				dethi.setCauhoi(rs.getString("cauhoi"));
				dethi.setDapan1(rs.getString("dapan1"));
				dethi.setDapan2(rs.getString("dapan2"));
				dethi.setDapan3(rs.getString("dapan3"));
				dethi.setDapan4(rs.getString("dapan4"));
				
				list.add(dethi);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;	
	}
}
