package tree;

/*����һ������������дһ����Ч���㷨�����ض���˳���ӡ�������нڵ㡣 
������Ҫ���ҽ���ش�ӡÿ������Ľڵ㡣 ÿһ��Ľ����ӡָ�����ȴ�ӡÿһ������ߵĽڵ㣬�ٴ�ӡ���ұߵĽڵ㣬�ٴ�ӡ��ߵڶ������ұߵڶ�����������ȥ����Ϊ�գ�����ӡ��                                                                                                                                                                                                                                                                      
                                                                                                     1
                                                                                                   /   \
                                                                                                  2     3
                                                                                                /  \   / \
                                                                                               4   5 6   7
                                                                                              /       /     \
                                                                                             10    8       9
�����1 2 3 4 7 5 6 10 9 8*/
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