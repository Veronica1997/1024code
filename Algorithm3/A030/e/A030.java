package e;

//给定一个二叉树，按照相反的顺序逐级打印其节点。 即最后一级存在的所有节点应首先打印，其次是第二级节点，依此类推。任何级别的所有节点都应从左到右打印。
//Reverse Level Order Traversal of Binary Tree 
public class A030 {
	Node root;

	/* Function to print REVERSE level order traversal a tree */
	public void reverseLevelOrder(Node node) {
		int h = height(node);
		int i;
		for (i = h; i >= 1; i--)
		// THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
		{
			printGivenLevel(node, i);
		}
	}

	/* Print nodes at a given level */
	public void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.data + " ");
		else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */
	int height(Node node) {
		if (node == null)
			return 0;
		else {
			/* compute the height of each subtree */
			int lheight = height(node.left);
			int rheight = height(node.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	public static void main(String args[]) {

		A030 tree = new A030();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.reverseLevelOrder(tree.root);

	}
}

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}