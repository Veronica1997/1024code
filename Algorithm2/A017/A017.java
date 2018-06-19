/*输入一个整数的排序数组，紧接着再输入一个数字，找到给定数字的在数组中第一个出现的索引。
 *  如果在数组中找不到元素，那么也报告。通过改良二分查找算法来实现，时间复杂度O(log(n))。输入个数为10
输入：2 5 5 5 6 6 8 9 9 9
        5
输出：First occurrence of element 5 is found at index 1*/
import java.util.*;
public class A017 {
	public static void main(String[] args){
		int a[] = new int[10];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m=input.nextInt();
		input.close();
		int i=0;
		for(i=0;i<a.length;i++) {
			if(m==a[i]) break;
		}
        System.out.println("First occurrence of element "+m+" is found at index "+i); 
    }
}
