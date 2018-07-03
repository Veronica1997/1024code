import java.util.ArrayList;
import java.util.List;

// for循环遍历ArrayList(0-9)再遍历所有奇数序号元素。
public class j142 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2!=0) {System.out.print(list.get(i)+" ");}
		}
	}
}
