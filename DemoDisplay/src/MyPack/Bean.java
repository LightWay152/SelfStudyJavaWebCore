package MyPack;

import java.util.ArrayList;
import java.util.List;

public class Bean 
{
	public static List<Users> ExportUsers()
	{
		List<Users>list=new ArrayList<Users>();
		
		list.add(new Users("Nguyễn Văn Tèo","lập trình viên"));
		list.add(new Users("Java web","công ty MyClass.Vn"));

		return list;
	}
}
