
/*ʹ�ù鲢���������������򡣹鲢������һ�ַ����㷨�� �����еķ����㷨һ�����鲢����һ��������ֳ�����
�����У�Ȼ��ݹ����������С� �����ϣ����������漰�������� - 
1.��δ��������黮��Ϊn�������飬ÿ����СΪ1����СΪ1�����鶼�����򣩡�
2.�ظ��ϲ��������������µ����������У�ֱ��ֻʣ��1�������У��⽫�����ǵ��������顣�������Ϊ6
���룺12 11 13 5 6 7
�����5 6 7 11 12 13*/
import java.util.*;

public class A010 {

	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = a[j++];
		}
		// ���������е�������nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			a[k2 + low] = temp[k2];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);//���ҹ鲢
		}

	}

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		mergeSort(a, 0, a.length - 1);
		for (int n = 0; n < a.length; n++) {
			System.out.print(a[n] + " ");
		}
	}
}
