//�Ը������н��н����Թ�����С���������ظ�����
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
