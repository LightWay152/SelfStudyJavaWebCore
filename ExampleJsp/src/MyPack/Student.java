package MyPack;

public class Student 
{
	private int num;
	private String username;
	
	public Student(int num, String username) {
		this.num = num;
		this.username = username;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
