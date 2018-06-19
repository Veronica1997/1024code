
/*使用快速排序对数组进行排序，通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。输入个数为9*/
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
