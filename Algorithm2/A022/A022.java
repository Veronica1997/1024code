/*ͨ���޸Ĳ�������ö��ֲ����㷨����һ��������ѭ����������������У��������е�һ��Ԫ�ز������������� 
����������û���ظ���ѭ����ת����ʱ�뷽��ġ��������Ϊ6*/
import java.util.Scanner;

public class A022 {

	public static int search(int[] a, int m, int left, int right) {
	    while(left<=right)
	    {
	        int mid = left + ((right-left)/2);
	        if(a[mid] == m)
	            return mid;

	        if(a[left] <= a[mid])//ת�۵����Ұ�ߣ���������������ģ���������߲�����ͨ�Ķ��ֲ���
	        {
	            if(a[left] <= m && m < a[mid])//Ŀ��Ԫ������ߣ����ұ��������м�
	                right = mid - 1;
	            else//Ŀ�����ұߣ�������������м�
	                left = mid + 1;
	        }
	        else //ת�۵������ߣ����������ע�͡�
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
