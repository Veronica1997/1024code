
/*给定二叉树，逐级打印其节点。 即应首先打印存在于级别1的所有节点，然后再打印第2级的节点等等。任何级别的所有节点应该从左到右打印。
                   1
                /    \
               2      3
              /  \   /   \
             4   5 6   7
                    /       \
                   8       9
输出：1 2 3 4 5 6 7 8 9 */
import java.util.*;

class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class A043 {
	Node root;

	public void print(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Node> listnode = new ArrayList<Node>();
		if (root == null) {
			return;
		}
		listnode.add(root);
		for (int i = 0; i < listnode.size(); i++) {
			Node node = listnode.get(i);
			if (node.left != null) {
				listnode.add(node.left);
			}
			if (node.right != null) {
				listnode.add(node.right);
			}
			list.add(node.data);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String args[]) {
		A043 tree = new A043();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.left = new Node(8);
		tree.root.right.right.right = new Node(9);
		tree.print(tree.root);
	}
}
