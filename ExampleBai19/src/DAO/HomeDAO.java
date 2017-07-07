package DAO;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.util.*;

public class HomeDAO {
	
	public static void UploadSingleFile(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		final String Address = "E:\\WorkSpace\\JavaWebJSPServletCore\\BackupDatabase\\UploadMultipleFile";
		final int MaxMemorySize = 1024*1024*3;// 3MB
		final int MaxRequestSize = 1024*1024*50;//50MB
		// Check that we have a file upload request
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		if(!isMultipart){
			request.setAttribute("message", "not have enctype: multipart/form-data");
		}
		
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		// Set factory constraints
		factory.setSizeThreshold(MaxMemorySize);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));//set temporarily directory
		
		// Create a new file upload handler 
		//-> to move file from temporarily directory to upload directory 
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		// Set overall request size constraint
		upload.setSizeMax(MaxRequestSize);
			
		try {
			// Parse the request
			List<FileItem> items = upload.parseRequest(request);
			
			// Process the uploaded items
			Iterator<FileItem> iter = items.iterator();
			
			while (iter.hasNext()) {
			    FileItem item = iter.next();//FileItem is file which you want upload

			    if (!item.isFormField()) {
			    	String fileName = item.getName();
			    	
			    	//pathFile: path of destination disk to store upload file
			    	String pathFile = Address + File.separator + fileName;
			    	
			    	File uploadedFile = new File(pathFile);
			    	boolean check = uploadedFile.exists();
			    	try {
			    		if(check==true){
							request.setAttribute("message", "File "+fileName+" existed. Required: test file again!");
			    		}else{
			    			item.write(uploadedFile);
							request.setAttribute("message", "Upload file successfully!");
			    		}
					} catch (Exception e) {
						request.setAttribute("message", e.getMessage());
					}
			    } else {
			    	request.setAttribute("message", "Upload file failed!");
			    }
			}
			
		} catch (FileUploadException e) {
			if(e.getMessage()!=null){
				request.setAttribute("message", e.getMessage());
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		rd.forward(request, response);
	}
}
