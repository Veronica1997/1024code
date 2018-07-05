//Convert Max Heap to Min Heap in linear time 将最大堆在线性时间内转换为最小堆
/*
将以下最大堆以线性时间转化为最小堆
输入格式：
9 4 7 1 -2 6 5
输出格式：
0 0 0 0
*/
import java.util.Arrays;
import java.util.Scanner;
public class A062 {
	 public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int[] array = new int[7];
	   for(int i=0;i<7;i++) {
		   array[i] = scanner.nextInt();
	   }
	   scanner.close();
	  Arrays.sort(array);  
	  for(int i=0;i<7;i++) {
		  System.out.print(array[i]+" ");
	  }
  }
}

