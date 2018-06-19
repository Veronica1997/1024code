package a;
//º∆À„÷±æ∂
class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int item) {
		data = item;
		left = right = null;
	}
}

public class A033 {
	static int diameter = 0;
	TreeNode root;

	public static int diameterOfBinaryTree(TreeNode root) {
		getDepth(root);
		return diameter+1;
	}

	static int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int l = getDepth(root.left);
		int r = getDepth(root.right);
		diameter = Math.max(diameter, l + r);
		return Math.max(l, r) + 1;
	}

	public static void main(String[] args) {
		A033 tree = new A033();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.right.left = new TreeNode(5);
		tree.root.right.right = new TreeNode(6);
		tree.root.right.left.left = new TreeNode(7);
		tree.root.right.left.right = new TreeNode(8);
		System.out.print(diameterOfBinaryTree(tree.root));  
	}
}
