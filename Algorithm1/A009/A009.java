
//将数组中存在的全部零移到最后
/*输入整数数组，将数组中存在的全部零移到最后。 该解决方案应该保持数组中非零项目的原本顺序不变。输入个数为9
输入：6 0 8 2 3 0 4 0 1
输出：6 8 2 3 4 1 0 0 0*/
import java.util.*;

public class A009 {
	public static void main(String[] args) {
		int[] a = new int[9];
		int[] b = new int[9];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		
		int j=8,k=0;
		for(int i=0;i<a.length;i++) {	
			if(a[i]==0) b[j--]=a[i];
			else b[k++]=a[i];
		}
		for(int n=0;n<b.length;n++) {
        	System.out.print(b[n]+" ");
        }
	}
}
