//输入一个二进制数组，在线性时间和恒定空间中排序。
import java.util.Scanner;
public class A004 {
	public static void main(String[] args){
        int a[]=new int[8]; 
        int count=0;
        Scanner input = new Scanner(System.in);
        for(int k=0;k<a.length;k++) {
        	a[k]=input.nextInt();
        	if(a[k]==0) count++;
        }	         
        for(int n=0;n<count;n++) {
        	System.out.print("0 ");
        }
        for(int n=count;n<a.length;n++) {
        	System.out.print("1 ");
        }
    }
}
