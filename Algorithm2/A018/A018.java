/*��һ�������Ľ�������������У�ÿ�����־��п��ܱ������ڴ����λ�ã���λ������ȷ����λ�ü���������С�ڵ���1��
 * �����ڸ������в��ҳ�һ��Ŀ����ֵ���������������
 * ���ø�����ֵ���������У�ͬ���������Element not found in the array��
Ŀ����ֵ�������е�����������ȷ�����λ��i���Ա�+/- 1λ���û����������Դ����������еģ�i-1����i��i + 1������
ʱ�临�Ӷ���O(log(n))���������Ϊ9
���룺2 1 3 5 4 7 6 8 9
        5
�����Element 5 found at index 3*/
import java.util.*;
public class A018 {
	public static void main(String[] args){
		int a[] = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m=input.nextInt();
		input.close();
		int i,flag=0;
		for(i=0;i<a.length;i++) {
			if(m==a[i]) {
				flag=1;
				System.out.println("Element "+m+" found at index "+i);
				break;
			}
		}
		if(flag==0) System.out.println("Element not found in the array");
    }
}
