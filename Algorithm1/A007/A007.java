
//输入一个整数数组，找到数组中乱序的下标范围，若将该范围内的数组元素重新排序，将使整个数组呈现递增的顺序。输入个数为8
import java.util.Scanner;

public class A007 {
	//就算不执行for循环也要有明确的return
	public static int Up(int[] a) {
		int i;
		for(i=1;i<a.length;i++) {
			if (a[i]<a[i-1]) {
				break;
			}
		}	
		return i-1;
	}
	
	public static int Dp(int[] a) {
		int i;
		for(i=a.length-1;i>=0;i--) {
			if (a[i]<a[i-1]) {
				break;
			}
		}	
		return i;
	}
	
	public static void main(String[] args) {
		int[] a = new int[8];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		System.out.println("Sort array from index "+Up(a)+" to "+Dp(a));
	}

}
