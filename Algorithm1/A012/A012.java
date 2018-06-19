//找到给定长度的所有不同组合
/*给定一个固定长度的整数数组{1，2，3,1}，找到其中整数两两配对的所有组合，并按照顺序输出。
 * 整数可以和自身配对。编写一段代码，代码运行后，可输出与样例结果一样的答案。不需要输入，只有输出。*/
import java.util.*;
public class A012 {
	public static void main(String[] args){
        int[] a= {1,2,3,1};
        Arrays.sort(a);
        
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		Integer[] b = list.toArray(new Integer[list.size()]);
		
		for(int i=0;i<b.length;i++) {
			for(int j=i;j<b.length;j++) {
				System.out.println(b[i] + " "+b[j]);
			}
		}
        
    }
}
