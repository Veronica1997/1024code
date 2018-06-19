
/*使用归并排序对数组进行排序。归并排序是一种分治算法。 像所有的分治算法一样，归并排序将一个大数组分成两个
子阵列，然后递归排序子阵列。 基本上，整个过程涉及两个步骤 - 
1.将未排序的数组划分为n个子数组，每个大小为1（大小为1的数组都被排序）。
2.重复合并子阵列以生成新的排序子阵列，直到只剩下1个子阵列，这将是我们的排序数组。输入个数为6
输入：12 11 13 5 6 7
输出：5 6 7 11 12 13*/
import java.util.*;

public class A010 {

	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		// 把较小的数先移到新数组中
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		// 把左边剩余的数移入数组
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		// 把右边边剩余的数移入数组
		while (j <= high) {
			temp[k++] = a[j++];
		}
		// 把新数组中的数覆盖nums数组
		for (int k2 = 0; k2 < temp.length; k2++) {
			a[k2 + low] = temp[k2];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);//左右归并
		}

	}

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		mergeSort(a, 0, a.length - 1);
		for (int n = 0; n < a.length; n++) {
			System.out.print(a[n] + " ");
		}
	}
}
