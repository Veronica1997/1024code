
//输入两个整数x和n，其中n是非负的，用分治算法实现幂函数x^n的值。
import java.util.*;

public class A016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = input.nextInt();
		input.close();
		int i=1,r=1;
		while(i<=n) {
			r*=x;
			i++;
		}			
		System.out.println(r);
	}
}
