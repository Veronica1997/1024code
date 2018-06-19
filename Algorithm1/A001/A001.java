/*使用插入排序对输入数组进行排序，插入排序：
每次将一个待排序的子序列，按其关键字大小插入到前面已经排好序的子序列中的适当位置，
直到全部子序列插入完成为止。*/
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

