//指数搜索：以2的n次方为边界（n=1,2,3,4…),先找到目标所在边界，然后在该边界内使用二分查找，从而减少查找的时间。
import java.util.Scanner;

public class A020 {
	public static int binarySearch(int[] a,int m,int low,int high) {
		int mid=(low+high)/2;
		if(m==a[mid]) return mid;
		else if(m<a[mid]) {
			return binarySearch(a,m,low,mid);
		}
		else if(m>a[mid]) {
			return binarySearch(a,m,mid+1,high);
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m=input.nextInt();
		input.close();
		if(binarySearch(a,m,0,4)==-1) System.out.println("Element not found");
		else System.out.println("Element found at index "+binarySearch(a,m,0,4));
	}

}
