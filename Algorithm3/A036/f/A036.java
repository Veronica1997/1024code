package f;

//Find Vertical Sum in a given Binary Tree 
import java.util.Map;
import java.util.TreeMap;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class A036 {
	Node root;

	public void print(Node node, int dist, Map<Integer, Integer> map) {
		if (node == null)
			return;

		if (!map.containsKey(dist))
			map.put(dist, node.data);
		else {
			int sum = map.get(dist);
			map.put(dist, node.data + sum);
		}

		print(node.left, dist - 1, map);
		print(node.right, dist + 1, map);
	}

	public static void main(String[] args) {

		A036 tree = new A036();
		Map<Integer, Integer> map = new TreeMap<>();// TreeMap保证添加进去的顺序

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.print(tree.root, 0, map);
		for (Integer value : map.values()) {
			System.out.print(value + " ");
		}
	}
}