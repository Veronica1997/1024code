package b;
//¶Ô³ÆÊ÷
class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int item) {
		data = item;
		left = right = null;
	}
}
public class A034 {
	TreeNode root;
    public static boolean isSymmetric(TreeNode root) {  
        if(root==null)  
            return true;  
        return isSymmetric(root.left,root.right);  
    }  
    public static boolean isSymmetric(TreeNode l,TreeNode r){  
        if(l==null && r==null)  
            return true;  
        if(l==null || r==null)  
            return false;  
        if(l.data==r.data)  
            return isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left);  
        return false;  
    }  
    
    public static void main(String[] args) {
		A034 tree = new A034();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.right = new TreeNode(6);
		tree.root.right.left = new TreeNode(5);
		if(isSymmetric(tree.root))
			System.out.print("yes");  
		else System.out.print("no");  
	}
}
