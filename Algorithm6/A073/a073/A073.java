package a073;
/*������״������ͣ�ԭ�������Ϊ10���洢��Ԫ�������Ӧ���±ꡣ����һ�������������±꣬����״������ǰ��n���ĺ� 
���룺3
�����6*/
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

