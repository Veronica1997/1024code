/*ʹ�ò����������������������򣬲�������
ÿ�ν�һ��������������У�����ؼ��ִ�С���뵽ǰ���Ѿ��ź�����������е��ʵ�λ�ã�
ֱ��ȫ�������в������Ϊֹ��*/
import java.util.Arrays;
import java.util.Scanner;
public class A001 {
	public static void main(String[] args){
        int a[]=new int[7]; 
        Scanner input = new Scanner(System.in);
        for(int k=0;k<a.length;k++) {
        	a[k]=input.nextInt();
        }	 
        Arrays.sort(a);  
        for(int n=0;n<a.length;n++) {
        	System.out.print(a[n]+" ");
        }
    }
}

