//Check if given array represents min heap or not 检查给定的数组是否代表最小堆
/*给定一个整数数组，检查该数组是否代表最小堆，输入数组个数为6
输入：1 2 3 4 5 6
输出：Given array is a min heap*/
import java.util.*;
public class A061 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int[] array = new int[6];
	   for(int i=0;i<6;i++) {
		   array[i] = scanner.nextInt();
	   }
	   scanner.close();
	   boolean result = false;
	   for(int i=0;i<5;i++) {
		  if(array[i] <array[i+1]) {
			  result = true;
		  }else {
			  result = false;
			  break;
		  }
		}
	   if(result == true) {
		   System.out.println("Given array is a min heap");
	   }else {
		   System.out.println("Given array is not a min heap"); 
	   }
		   
	   }
	   
   } 
