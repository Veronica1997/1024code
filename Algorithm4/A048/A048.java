//在表达式中找到重复的括号
import java.util.Scanner;
import java.util.Stack;

public class A048 {
	public static boolean found(String str) {
		  Stack<Character> stack  = new Stack<Character>();
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(ch != ')') {
				  stack.push(ch);
			  }else {
				  if(stack.peek() == '(') {
					  return true;
				  }
				  while(stack.peek() != '(') {
					  stack.pop();
				  }
				  stack.pop();
			  }
		  }
		  return false;
	 }
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			scanner.close();
			
			if(found(str)) {
				System.out.println("Duplicate Found");
			}else {
				System.out.println("No Duplicates Found");
			}
	  }
}

