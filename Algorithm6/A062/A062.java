//Convert Max Heap to Min Heap in linear time ������������ʱ����ת��Ϊ��С��
/*
����������������ʱ��ת��Ϊ��С��
�����ʽ��
9 4 7 1 -2 6 5
�����ʽ��
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

