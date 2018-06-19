
/*输入一组数据，创建一棵二叉树，写出它的add方法和print方法。
要求加入节点的时候大的放右边，小的放左边。
输出按中序遍历输出。输入节点数据，输出中序遍历结果。*/
import java.util.*;

class BinaryTree {
	class Node {
		private int data; // 保存数据内容
		private Node left; // 左子树
		private Node right;// 右子树

		public Node(int data) {
			this.data = data;
		}

		public void addNode(Node newNode) { // addNode方法用来添加数据
			if (newNode.data <= this.data) {
				if (this.left == null) { // 左子树为空
					this.left = newNode;
				} else {
					this.left.addNode(newNode);// 继续向下判断
				}
			}
			if (newNode.data > this.data) {
				if (this.right == null) { // 右子树为空
					this.right = newNode;
				} else {
					this.right.addNode(newNode);// 继续向下判断
				}
			}
		} 

		public void printNode() { // 采用中序遍历（左-根-右)
			if (this.left != null) {
				this.left.printNode();
			}
			System.out.print(this.data+" "); // 找到根内容
			if (this.right != null) {
				this.right.printNode();
			}
		}
	} 

	private Node root; // 根节点

	public void add(int data) {
		Node newNode = new Node(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
	}

	public void print() {
		this.root.printNode();
	}
}

public class A028 {
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < 6; k++) {
			bt.add(input.nextInt());
		}
		input.close();
		bt.print();
	}
}