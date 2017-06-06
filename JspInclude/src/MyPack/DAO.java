package MyPack;

import java.util.ArrayList;
import java.util.List;

public class DAO 
{
	public static List<Users> ExportUsers()
	{
		List<Users> list=new ArrayList<Users>();
		
		list.add(new Users("Nguyễn Văn Tèo","lập trình viên"));
		list.add(new Users("Java Web","tại công ty oursourcing"));
		
		return list;
	}
	
	public static List<Student> ExportStudent()
	{
		List<Student> listStudent=new ArrayList<Student>();
		
		listStudent.add(new Student(1,"Nguyễn Văn Tèo"));
		listStudent.add(new Student(2,"Lê Thị Bưởi"));
		listStudent.add(new Student(3,"Trần Thị Mận"));
		listStudent.add(new Student(4,"Trương Tam Đào"));
		listStudent.add(new Student(5,"Nguyễn Phúc Tâm"));
		listStudent.add(new Student(6,"Lê Đoàn Giỏi"));
		
		return listStudent;
	}

}
