
/*ʹ�ÿ�������������������ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�
 * ����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��Ȼ���ٰ��˷����������������ݷֱ���п�������
 * ����������̿��Եݹ���У��Դ˴ﵽ�������ݱ���������С��������Ϊ9*/
import java.util.Scanner;
public class A005 {
	public static void main(String[] args) {
		int[] a = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		quickSort(a);
		for (int n = 0; n < a.length; n++) {
			System.out.print(a[n] + " ");
		}
	}
	public static void quickSort(int[] a) {
		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
	}
	private static void quickSort(int[] a, int low, int high) {
		if (low > high) {
			return;
		}
		int i = low;
		int j = high;
		int key = a[low];
		while (i < j) {
			while (i < j && a[j] > key) {
				j--;
			}
			while (i < j && a[i] <= key) {
				i++;
			}
			if (i < j) {
				int p = a[i];
				a[i] = a[j];
				a[j] = p;
			}
		}
		int p = a[i];
		a[i] = a[low];
		a[low] = p;
		quickSort(a, low, i - 1);
		quickSort(a, i + 1, high);
	}
}
