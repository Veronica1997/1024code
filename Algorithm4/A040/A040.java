
//打印出所有和为0的子数组
/*输入一个整数数组，检查数组是否包含一个包含和为0的子数组。此外，输出所有子数组第一个和最后一个索引。输入个数为6个
输入：4 2 -3 -1 0 4
输出：
2 5
4 4*/
import java.util.Scanner;

public class A040 {
	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		input.close();
		subSum(a);
	}

	public static void subSum(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			start = i;
			end = i;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				end = j;
				if (sum == 0) {
					System.out.println(start + " " + end);
				}
			}
		}
	}
}
