/*����һ���������������飬������������һ�����֣��ҵ��������ֵ��������е�һ�����ֵ�������
 *  ������������Ҳ���Ԫ�أ���ôҲ���档ͨ���������ֲ����㷨��ʵ�֣�ʱ�临�Ӷ�O(log(n))���������Ϊ10
���룺2 5 5 5 6 6 8 9 9 9
        5
�����First occurrence of element 5 is found at index 1*/
import java.util.*;
public class A017 {
	public static void main(String[] args){
		int a[] = new int[10];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m=input.nextInt();
		input.close();
		int i=0;
		for(i=0;i<a.length;i++) {
			if(m==a[i]) break;
		}
        System.out.println("First occurrence of element "+m+" is found at index "+i); 
    }
}
