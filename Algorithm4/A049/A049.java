//对给定序列进行解码以构造最小数，而不重复数字
import java.util.Scanner;
import java.util.Stack;

public class A049 {
	public static StringBuilder decode(String seq) {
		StringBuilder result = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i <= seq.length(); i++) {
			stack.push(i + 1);
			if (i == seq.length() || seq.charAt(i) == 'I') {
				while (!stack.isEmpty()) {
					result.append(stack.pop() + " ");
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String seq = scanner.nextLine();
		System.out.println(decode(seq));
	}
}
