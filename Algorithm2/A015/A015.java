
//��������
/*����һ��������ɵ����������һ��Ŀ��ֵ��ʹ�ö��ֲ����㷨�ҳ�Ŀ��ֵ�Ƿ�����������У�
 * ���Ŀ������������У���������������������Element not found���������Ϊ5��ʱ�临�Ӷ�O(log(n))
���룺2 3 5 7 9
        7
�����Element found at index 3*/
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
