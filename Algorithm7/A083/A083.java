import java.util.*;

//A[s] �C A[r] + A[q] �C A[p] where s > r > q > p ��󻯱��ʽ��ֵ
/*����һ������A����󻯱��ʽ��ֵ��A [s] -A [r] + A [q] -A [p]������p��q��r��s�����������������s> r> q> p��
���磬
���룺3 9 10 1 30 40
�����46
��40 - 1 + 10 - 3�����������ֵ���������Ϊ6*/
public class A083 {
	public static int maxExpression(int[] array) {
		int[] L1 = new int[array.length + 1];
		Arrays.fill(L1, Integer.MIN_VALUE);

		int[] L2 = new int[array.length];
		Arrays.fill(L2, Integer.MIN_VALUE);

		int[] L3 = new int[array.length - 1];
		Arrays.fill(L3, Integer.MIN_VALUE);

		int[] L4 = new int[array.length - 2];
		Arrays.fill(L4, Integer.MIN_VALUE);

		for (int i = array.length - 1; i >= 0; i--) {
			L1[i] = Integer.max(L1[i + 1], array[i]);
		}

		for (int i = array.length - 2; i >= 0; i--) {
			L2[i] = Integer.max(L2[i + 1], L1[i + 1] - array[i]);
		}

		for (int i = array.length - 3; i >= 0; i--) {
			L3[i] = Integer.max(L3[i + 1], L2[i + 1] + array[i]);
		}

		for (int i = array.length - 4; i >= 0; i--) {
			L4[i] = Integer.max(L4[i + 1], L3[i + 1] - array[i]);
		}

		return L4[0];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(maxExpression(array));
	}
}
