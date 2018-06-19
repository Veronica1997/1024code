package h;
//打印二叉树中每个级别的角点
import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right, nextRight;

	Node(int item) {
		data = item;
		left = right = nextRight = null;
	}
}

public class A039 {
	Node root;

	public void print(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			int i = 0;
			while (i++ < size) {
				Node front = q.peek();
				q.poll();
				if (i == 1 || i == size) {
					System.out.print(front.data + " ");
				}
				if (front.left != null)
					q.offer(front.left);
				if (front.right != null)
					q.offer(front.right);

			}
		}
	}

	public static void main(String args[]) {
		A039 tree = new A039();

		tree.root = new Node(26);
		tree.root.right = new Node(3);
		tree.root.right.right = new Node(3);
		tree.root.left = new Node(10);
		tree.root.left.left = new Node(4);
		tree.root.left.left.right = new Node(30);
		tree.root.left.right = new Node(6);
		tree.print(tree.root);
	}
}
