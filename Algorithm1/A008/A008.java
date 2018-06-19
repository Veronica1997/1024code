
//从给定数字的集合中查找最大数量
/*从数字的数组中查找最大数。 输入一个数字数组，以任何顺序相互组合形成最大数字。输出这些组合中最大的数字.输入个数为6
输入：10 68 75 7 21 12
输出：77568211210*/
import java.util.*;

public class A008 {
	public static void main(String[] args) {
		int[] a = new int[6];
		int[] b=new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		Arrays.sort(a);
		if(a[5]%10<a[0]) {
			b[5]=a[0];
			for(int i=4;i>=0;i--) {
				b[i]=a[i+1];
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = b.length-1; i >=0; i--) {
			sb.append(b[i]);
		}
		System.out.print(sb.toString());
	}

}
