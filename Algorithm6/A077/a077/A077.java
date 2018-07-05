package a077;
// Find inorder predecessor for given key in a BST 在BST中找到给定键的前导
/*给定一个BST，找到一个给定键的前导。
BST中节点的前导是其按大小顺序排列的前一个节点。
例如，考虑下面的树
          15
        /      \
      10     20 
      / \      /   \
     8  12 16  25
8的前导不存在。
10的前导是8
12的前导是10
20的前导是16
一个节点的前导是其左子树的最右边的节点（最大值），若左子树不存在，则去找其祖先节点（按从小到大顺序排在该节点前一个节点）
输入：10
输出：8
输入：8
输出：no*/
import java.util.*;

class TreeNode{
	int data;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int data){
		this.data = data;
	}
}

public class A077 {
   public static TreeNode insert(TreeNode root,int key) {
	   if(root == null) return new TreeNode(key);
	   if(key < root.data) {
		   root.left = insert(root.left,key);
	   }else {
		   root.right = insert(root.right,key);
	   }
	   return root;
   }
   public static TreeNode findMaximum(TreeNode root) {
	   while(root.right != null) {
		   root = root.right;
	   }
	   return root;
   } 
   public static TreeNode findProdecessor(TreeNode root,TreeNode prec,int key) {
	   if(root == null) return prec;
	   if(root.data == key) {
		   if(root.left != null) {
			   return findMaximum(root.left);
		   }
		 }else if(key < root.data) {
			 return findProdecessor(root.left,prec,key);
		 }else {
			 prec = root;
			 return findProdecessor(root.right,prec,key);
		 }
	   return prec;
   }
   public static void main(String[] args) {
	   TreeNode root = null;
	   int[] keys = {8,10,12,15,16,20,25};
	   for(int key:keys) {
		   root = insert(root,key);
	   }
	Scanner scanner = new Scanner(System.in);
	int key = scanner.nextInt();
	scanner.close();
	TreeNode prec = findProdecessor(root,null,key);
	if(prec != null) {
		System.out.println(prec.data);
	}else {
		System.out.println("no");
	}
   }
}


