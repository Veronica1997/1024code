package a;
//确定给定的两个节点是否是彼此的堂兄节点
import java.util.Scanner;

class Node {
	private int data;
	private Node left;
	private Node right;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}

public class A032 {
	Node root;

	public boolean isSibling(Node node, int a, int b) {
		if (node == null)
			return false;
		if (node.getLeft() != null && node.getRight() != null) {
			if ((node.getLeft().getData() == a && node.getRight().getData() == b)
					|| (node.getLeft().getData() == b && node.getRight().getData() == a))
				return true;

			return isSibling(node.getRight(), a, b) || isSibling(node.getLeft(), a, b);
		}
		return false;
	}

	// 返回该节点的级数
	public int level(Node node, int ptr, int lev) {
		if (node == null)
			return -1;
		if (node.getData() == ptr)
			return lev;
		int l = level(node.getLeft(), ptr, lev + 1);
		if (l != -1)
			return level(node.getLeft(), ptr, lev + 1);
		return level(node.getRight(), ptr, lev + 1);

	}

	public boolean iterative(Node root, int a, int b) {
		if (root == null)
			return false;
		if ((level(root, a, 0) == level(root, b, 0)) && !isSibling(root, a, b))
			return true;
		return false;
	}

	public static void main(String[] args) {

		A032 tree = new A032();

		tree.root = new Node(1);
		tree.root.setLeft(new Node(2));
		tree.root.setRight(new Node(3));
		tree.root.getLeft().setLeft(new Node(4));
		tree.root.getLeft().setRight(new Node(5));
		tree.root.getRight().setLeft(new Node(6));
		tree.root.getRight().setRight(new Node(7));
		tree.root.getLeft().getLeft().setLeft(new Node(8));
		tree.root.getRight().getRight().setRight(new Node(9));
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (tree.iterative(tree.root, x, y))
			System.out.println("yes");
		else
			System.out.println("no");

	}
}