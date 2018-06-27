
//�øߵͽ����˳��������������
/*����һ���������飬���°��ոߵͽ����˳�����и����飬ʹ�õ�N��Ԫ�ش���������Ԫ�أ���NΪż��������������û���ظ���Ԫ�ء�����ĸ�����5��
���룺9 6 8 3 7
�����6 9 3 8 7*/
import java.util.Scanner;

public class A042 {
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i += 2) {
			if (array[i - 1] > array[i]) {
				swap(array, i - 1, i);
			}
			if (i + 1 < array.length && array[i + 1] > array[i]) {
				swap(array, i + 1, i);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		input.close();
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}