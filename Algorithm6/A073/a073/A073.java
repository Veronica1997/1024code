package a073;
/*利用树状数组求和，原数组个数为10，存储的元素是其对应的下标。输入一个数代表数组下标，用树状数组求前面n个的和 
输入：3
输出：6*/
import java.util.*;

public class A073 {
	public static void main(String[] args) {
   int[] array = new int[10];
   for(int i=0;i<10;i++) {
	   array[i] = i;
     }
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   scanner.close();
   int sum = 0;
   for(int i=0;i<=n;i++) {
	   sum += i;
   }
   System.out.println(sum);
   }
}

