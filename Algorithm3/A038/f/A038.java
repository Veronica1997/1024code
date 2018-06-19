package f;

//找到给定二叉树的对角线和
import java.util.Map;
import java.util.TreeMap;

class TNode {
	int data;
	TNode left, right;

	TNode(int item) {
		data = item;
		left = right = null;
	}
}

public class A038 {
	TNode root;

	public void print(TNode node, int dist, Map<Integer, Integer> map) {
		if (node == null)
			return;
		if (!map.containsKey(dist)) {
			map.put(dist, node.data);
		} else {
			int sum = map.get(dist) + node.data;
			map.put(dist, sum);
		}

		print(node.left, dist - 1, map);
		print(node.right, dist, map);
	}

	public static void main(String[] args) {

		A038 tree = new A038();
		Map<Integer, Integer> map = new TreeMap<>();
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.right.left = new TNode(5);
		tree.root.right.right = new TNode(6);
		tree.root.right.left.left = new TNode(7);
		tree.root.right.left.right = new TNode(8);
		tree.print(tree.root, 0, map);
		for (Integer value : map.values()) {
			System.out.print(value + " ");
		}
	}
}