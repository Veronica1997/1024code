
//二分搜索
/*输入一个整数组成的排序数组和一个目标值，使用二分查找算法找出目标值是否存在于数组中，
 * 如果目标存在于数组中，则输出其索引，否则输出Element not found。输入个数为5，时间复杂度O(log(n))
输入：2 3 5 7 9
        7
输出：Element found at index 3*/
import java.util.*;

public class A015 {
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
