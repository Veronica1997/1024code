
// Find all Permutations of a given string ���Ҹ����ַ�������������
/*����һ���ַ������ҳ����������������
���룺ABC
�����ABC ACB BAC BCA CBA CAB */
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
				swap(s, i, from); // ����ǰ׺��ʹ�������һ��ǰ׺
				permutation(s, from + 1, to);
				swap(s, from, i); // ��ǰ׺���أ���������һ��ǰ׺������
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
		char c[] = a.toCharArray();// ����toCharArray����ת��
		permutation(c, 0, 2);
	}
}
