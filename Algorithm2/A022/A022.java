/*通过修改并灵活运用二分查找算法，在一个给定的循环排序的整数数组中，搜索其中的一个元素并给出其索引。 
假设阵列中没有重复，循环旋转是逆时针方向的。输入个数为6*/
import java.util.Scanner;

public class A022 {

	public static int search(int[] a, int m, int left, int right) {
	    while(left<=right)
	    {
	        int mid = left + ((right-left)/2);
	        if(a[mid] == m)
	            return mid;

	        if(a[left] <= a[mid])//转折点在右半边，左半边是有序递增的，所以在左边采用普通的二分查找
	        {
	            if(a[left] <= m && m < a[mid])//目标元素在左边，将右边缩减到中间
	                right = mid - 1;
	            else//目标在右边，将左边缩减到中间
	                left = mid + 1;
	        }
	        else //转折点在左半边，类似上面的注释。
	        {
	            if(a[mid] < m && m <= a[right])
	                left = mid + 1;
	            else
	                right = mid - 1;
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m = input.nextInt();
		input.close();
		if (search(a,m,0,a.length - 1) != -1)
			System.out.println("Element found at index " + +search(a,m,0,a.length - 1));
		else
			System.out.println("Element not present");
	}

}
