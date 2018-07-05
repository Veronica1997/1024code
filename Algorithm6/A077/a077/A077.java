package a077;
// Find inorder predecessor for given key in a BST ��BST���ҵ���������ǰ��
/*����һ��BST���ҵ�һ����������ǰ����
BST�нڵ��ǰ�����䰴��С˳�����е�ǰһ���ڵ㡣
���磬�����������
          15
        /      \
      10     20 
      / \      /   \
     8  12 16  25
8��ǰ�������ڡ�
10��ǰ����8
12��ǰ����10
20��ǰ����16
һ���ڵ��ǰ�����������������ұߵĽڵ㣨���ֵ�����������������ڣ���ȥ�������Ƚڵ㣨����С����˳�����ڸýڵ�ǰһ���ڵ㣩
���룺10
�����8
���룺8
�����no*/
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


