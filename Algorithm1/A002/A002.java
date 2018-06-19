
//使用选择排序对输入数组进行排序，它的工作原理是每一次从待排序的数据元素中选出最小(或最大)的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完 输入个数为7
import java.util.Scanner;

public class A002 {
	public static void main(String[] args){
        int a[]=new int[7]; 
        Scanner input = new Scanner(System.in);
        for(int k=0;k<a.length;k++) {
        	a[k]=input.nextInt();
        }	 
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }  
    }
        for(int n=0;n<a.length;n++) {
        	System.out.print(a[n]+" ");
        }
    }
}
