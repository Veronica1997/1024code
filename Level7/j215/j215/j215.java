package j215;
import java.util.*;
public class j215 {
	public static void main(String[] args) {
		User u=new User("zhangsan",123456);
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		if(a.equals(u.getName())) System.out.println("is true");
		else System.out.println("is false");
		
	}
}
