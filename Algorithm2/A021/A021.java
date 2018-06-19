
//��ֵ����
/*ͨ���Ƚϲ�ֵ������ÿ�����������У����������ռ�ĵ�ֵ�͸�ֵ�Լ�Ŀ��ֵ����Ŀ����ܴ��ڵ�ʣ�������ռ����� 
 * Ȼ���ڸù���λ��ʵ�ʷ��ֵ�ֵ��Ŀ��ֵ���бȽϡ� �������ȣ�����ݱȽϣ�ʣ��������ռ���ٵ�����λ��֮ǰ��֮��Ĳ��֡�
 * �������Ϊ5
���룺
2 3 5 7 9
7
�����Element found at index 3*/
import java.util.*;

public class A021 {

	public static int search(int[] arr, int key, int left, int right) {
		while (left < right) {
			int middle = left + (right - left) * ((key - arr[left]) / (arr[right] - arr[left]));
			if (arr[middle] == key) {
				return middle;
			}
			if (key < arr[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
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
