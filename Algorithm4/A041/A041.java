
// �ҳ���Ϊָ��ֵ���������
/*����һ���������飬�ҵ���Ϊָ��ֵ����������顣
���룺
5 6 -5 5 3 5 3 -2 0
8
�����2 5*/
import java.util.Scanner;

public class A041 {
	public static void main(String[] args) {
		int a[] = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m = input.nextInt();
		input.close();
		subSum(a, m);
	}

	public static void subSum(int[] array, int n) {
		if (array == null || array.length == 0) {
			return;
		}
		int len = 0;
		int endIndex = -1;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == n) {
					if (len < j - i + 1) {
						len = j - i + 1;
						endIndex = j;
					}
				}
			}
		}
		System.out.println((endIndex - len + 1) + " " + endIndex);
	}
}
