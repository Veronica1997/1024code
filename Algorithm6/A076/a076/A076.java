package a076;

//Merge M sorted lists of variable length 合并M个长度不一的排序列表
/*合并M个长度不一的排序列表
给定M个长度不一的排序列表，并有序的输出。
例如，
输入：在代码中定义4个可变长度的排序列表
[10，20，30，40]
[15,25,35]
[27,29,37,48,93]
[32,33]
输出：
10 15 20 25 27 29 30 32 33 35 37 40 48 93 。使用最小堆
*/
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class N implements Comparable<Object> {
	private int value;
	private int i;
	private int index;

	public N(int value, int i, int index) {
		this.value = value;
		this.i = i;
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public int getListNum() {
		return i;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int compareTo(Object o) {
		N node = (N) o;
		return value - node.value;
	}
};

public class A076 {
	public static void printSorted(List<List<Integer>> list) {
		PriorityQueue<N> pq = new PriorityQueue<N>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).size() >= 1) {
				pq.add(new N(list.get(i).get(0), i, 0));
			}
		}
		while (!pq.isEmpty()) {
			N min = pq.poll();
			System.out.print(min.getValue() + " ");
			if (min.getIndex() + 1 < list.get(min.getListNum()).size()) {
				min.setIndex(min.getIndex() + 1);
				min.setValue(list.get(min.getListNum()).get(min.getIndex()));
				pq.add(min);
			}
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(10, 20, 30, 40), Arrays.asList(15, 25, 35),
				Arrays.asList(27, 29, 37, 48, 93), Arrays.asList(32, 33));
		printSorted(list);
	}
}
