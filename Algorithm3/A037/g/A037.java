package g;

//Print nodes in vertical order of a given Binary Tree (Vertical Traversal) 
import java.util.ArrayList;
import java.util.List;
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

public class A037 {
	Node root;

	public void print(Node node, int dist, Map<Integer, List<Integer>> map) {
		if (node == null)
			return;

		if (!map.containsKey(dist)) {
			List<Integer> list = new ArrayList<>();
			list.add(node.data);
			map.put(dist, list);
		} else {
			map.get(dist).add(node.data);
		}

		print(node.left, dist - 1, map);
		print(node.right, dist + 1, map);
	}

	public static void main(String[] args) {

		A037 tree = new A037();
		Map<Integer, List<Integer>> map = new TreeMap<>();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.print(tree.root, 0, map);
		for (List<Integer> value : map.values()) {
			for (Integer x : value)
				System.out.print(x + " ");
			System.out.println();
		}

	}
}
