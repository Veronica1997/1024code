
// Find all Permutations of a given string 查找给定字符串的所有排列
/*输入一个字符串，找出他的所有排列组合
输入：ABC
输出：ABC ACB BAC BCA CBA CAB */
import java.util.*;

public class A078 {
	public static void permutation(char[] s, int from, int to) {
		if (to <= 1)
			return;
		if (from == to) {
			System.out.print(s);
			System.out.print(" ");
		} else {
			for (int i = from; i <= to; i++) {
				swap(s, i, from); // 交换前缀，使其产生下一个前缀
				permutation(s, from + 1, to);
				swap(s, from, i); // 将前缀换回，继续做上一个前缀的排列
			}
		}
	}

	public static void swap(char[] s, int i, int j) {
		char tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		input.close();
		char c[] = a.toCharArray();// 利用toCharArray方法转换
		permutation(c, 0, 2);
	}
}
