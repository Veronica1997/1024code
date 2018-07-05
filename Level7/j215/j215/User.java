package j215;

public class User {
	public String name;
	public int password;
	
	public User(String name,int password) {
		this.name=name;
		this.password=password;
	}
	public String getName(){
		return this.name;
	}
}
