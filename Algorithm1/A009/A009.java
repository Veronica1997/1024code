
//�������д��ڵ�ȫ�����Ƶ����
/*�����������飬�������д��ڵ�ȫ�����Ƶ���� �ý������Ӧ�ñ��������з�����Ŀ��ԭ��˳�򲻱䡣�������Ϊ9
���룺6 0 8 2 3 0 4 0 1
�����6 8 2 3 4 1 0 0 0*/
import java.util.*;

public class A009 {
	public static void main(String[] args) {
		int[] a = new int[9];
		int[] b = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		
		int j=8,k=0;
		for(int i=0;i<a.length;i++) {	
			if(a[i]==0) b[j--]=a[i];
			else b[k++]=a[i];
		}
		for(int n=0;n<b.length;n++) {
        	System.out.print(b[n]+" ");
        }
	}
}
