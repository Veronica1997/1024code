
//����һ���������飬�ҵ�������������±귶Χ�������÷�Χ�ڵ�����Ԫ���������򣬽�ʹ����������ֵ�����˳���������Ϊ8
import java.util.Scanner;

public class A007 {
	//���㲻ִ��forѭ��ҲҪ����ȷ��return
	public static int Up(int[] a) {
		int i;
		for(i=1;i<a.length;i++) {
			if (a[i]<a[i-1]) {
				break;
			}
		}	
		return i-1;
	}
	
	public static int Dp(int[] a) {
		int i;
		for(i=a.length-1;i>=0;i--) {
			if (a[i]<a[i-1]) {
				break;
			}
		}	
		return i;
	}
	
	public static void main(String[] args) {
		int[] a = new int[8];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		System.out.println("Sort array from index "+Up(a)+" to "+Dp(a));
	}

}
