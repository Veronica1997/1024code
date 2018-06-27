
//检查给定的表达式是否平衡表达式
import java.util.*;

public class A047 {
	public static boolean banlanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (ch == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		if (banlanced(str)) {
			System.out.println("The expression is balanced");
		} else {
			System.out.println("The expression is not balanced");
		}
	}
}
