
//用桶排序对数组进行排序并求得相邻最大差值
import java.util.Scanner;

public class A006 {

	public int[] bucketSort(int[] array) {
		int[] a = new int[11];
		for (int i = 0; i < array.length; i++) {
			a[array[i]] = array[i];
		}
		return a;
	}

	public static int MaxDivision(int[] b) {
		int max = b[1] - b[0];
		for (int i = 1; i < b.length; i++) {
			if (b[i] - b[i - 1] > max) {
				max = b[i + 1] - b[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		A006 bucket = new A006();
		int[] array = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < array.length; k++) {
			array[k] = input.nextInt();
		}
		int[] a = bucket.bucketSort(array);
		int[] b = new int[6];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[j++] = a[i];
				System.out.print(a[i] + " ");
			}
		}
		System.out.print("\n");
		System.out.print(MaxDivision(b));
	}
}
