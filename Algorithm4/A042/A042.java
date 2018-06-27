
//用高低交替的顺序重新排列数组
/*给定一个整数数组，重新按照高低交替的顺序排列该数组，使得第N个元素大于其两侧元素，且N为偶数。假设数组中没有重复的元素。输入的个数是5个
输入：9 6 8 3 7
输出：6 9 3 8 7*/
import java.util.Scanner;

public class A042 {
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i += 2) {
			if (array[i - 1] > array[i]) {
				swap(array, i - 1, i);
			}
			if (i + 1 < array.length && array[i + 1] > array[i]) {
				swap(array, i + 1, i);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		input.close();
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}