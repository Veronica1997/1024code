
/*����һ�����ݣ�����һ�ö�������д������add������print������
Ҫ�����ڵ��ʱ���ķ��ұߣ�С�ķ���ߡ�
���������������������ڵ����ݣ����������������*/
import java.util.*;

class BinaryTree {
	class Node {
		private int data; // ������������
		private Node left; // ������
		private Node right;// ������

		public Node(int data) {
			this.data = data;
		}

		public void addNode(Node newNode) { // addNode���������������
			if (newNode.data <= this.data) {
				if (this.left == null) { // ������Ϊ��
					this.left = newNode;
				} else {
					this.left.addNode(newNode);// ���������ж�
				}
			}
			if (newNode.data > this.data) {
				if (this.right == null) { // ������Ϊ��
					this.right = newNode;
				} else {
					this.right.addNode(newNode);// ���������ж�
				}
			}
		} 

		public void printNode() { // ���������������-��-��)
			if (this.left != null) {
				this.left.printNode();
			}
			System.out.print(this.data+" "); // �ҵ�������
			if (this.right != null) {
				this.right.printNode();
			}
		}
	} 

	private Node root; // ���ڵ�

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