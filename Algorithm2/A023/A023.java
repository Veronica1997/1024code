
//计算一个有重复值的排序数组中一个给定数字的出现次数
import java.util.Scanner;

public class A023 {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m = input.nextInt();
		input.close();
		int count = 0, flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == m) {
				flag = 1;
				count++;
			}
		}
		if (flag == 0)
			System.out.println("Element not found in the array");
		else
			System.out.println("Element " + m + " occurs " + count);
	}
}
