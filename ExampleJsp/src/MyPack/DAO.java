package MyPack;

import java.util.ArrayList;
import java.util.List;

public class DAO 
{
	public static List<Users> ExportUsers()
	{
		List<Users> list=new ArrayList<Users>();
		
		list.add(new Users("Nguyễn Văn Tèo","Lập trình viên"));
		list.add(new Users("Java Web","công ty outsourcing"));
		
		return list;
	}
	
	public static List<Student> ExportStudent()
	{
		List<Student> listStudent=new ArrayList<Student>();
		
		listStudent.add(new Student(1,"Nguyễn Văn Tèo"));
		listStudent.add(new Student(2,"Trần Thiện Chí"));
		listStudent.add(new Student(3,"Lê Hà Bá"));
		listStudent.add(new Student(4,"Nguyễn Đình Công"));
		listStudent.add(new Student(5,"Lê Văn Bèo"));
		listStudent.add(new Student(6,"Trương Tam Phong"));
		
		return listStudent;
	}

}
