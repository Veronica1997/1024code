/*在一个给定的近似排序的数组中，每个数字均有可能被放置在错误的位置，该位置与正确排序位置间的索引差距小于等于1。
 * 快速在该数组中查找出一个目标数值，并输出其索引。
 * 若该给定数值不在数组中，同样输出报告Element not found in the array。
目标数值在数组中的索引处于正确排序的位置i可以被+/- 1位置置换，即它可以存在于数组中的（i-1）或i或（i + 1）处。
时间复杂度在O(log(n))。输入个数为9
输入：2 1 3 5 4 7 6 8 9
        5
输出：Element 5 found at index 3*/
import java.util.*;
public class A018 {
	public static void main(String[] args){
		int a[] = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m=input.nextInt();
		input.close();
		int i,flag=0;
		for(i=0;i<a.length;i++) {
			if(m==a[i]) {
				flag=1;
				System.out.println("Element "+m+" found at index "+i);
				break;
			}
		}
		if(flag==0) System.out.println("Element not found in the array");
    }
}
