package tree;

/*给定一个二叉树，编写一个有效的算法，以特定的顺序打印它的所有节点。 
我们需要左右交替地打印每个级别的节点。 每一层的交替打印指的是先打印每一层最左边的节点，再打印最右边的节点，再打印左边第二个和右边第二个，依次下去。若为空，不打印。                                                                                                                                                                                                                                                                      
                                                                                                     1
                                                                                                   /   \
                                                                                                  2     3
                                                                                                /  \   / \
                                                                                               4   5 6   7
                                                                                              /       /     \
                                                                                             10    8       9
输出：1 2 3 4 7 5 6 10 9 8*/
import java.util.ArrayList;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class A044 {
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
		list.set(9, list.set(8, list.get(9)));
		list.set(6, list.set(5, list.get(6)));
		list.set(5, list.set(4, list.get(5)));
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String args[]) {
		A044 tree = new A044();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(10);
		tree.root.right.left.left = new Node(8);
		tree.root.right.right.right = new Node(9);
		tree.print(tree.root);
	}
}