/*给定一个二叉树，检查它是否是一个完整二叉树。一个完整二叉树是一个二叉树，其中每层除了最后一个，都完全被填满节点，倒数第二层最后一个可以只有左子树，但不能只有右子树          
                       1
                     /    \
                     2     3
                   /  \   /   \
                  4   5 6   7
                         /       \
                        8       9
输出：NO*/
import java.util.*;

class TreeNode{
	int root;
	TreeNode left,right;
	TreeNode(int root){
		this.root = root;
		left = right = null;
	}
}

public class A052 {
      private LinkedList<TreeNode>list = new LinkedList<TreeNode>();
      boolean leftMost = false;
      public boolean child(TreeNode child) {
    	  if(child != null) {
    		  if(!leftMost) {
    			  list.addLast(child);
    		  }else {
    			  return false;
    		  }
    	  }else {
    		  leftMost = true;
    	  }
    	  return true;
      }
      public boolean isCompleteTree(TreeNode root) {
    	  if(root == null) return true;
    	  list.addLast(root);
    	  while( !list.isEmpty()) {
    		  TreeNode node = list.removeFirst();//处理左子节点
    		  if(!child(node.left))return false;
    		  if(!child(node.right)) return false;
    	  }
    	  return true;
      }
       static   TreeNode root;
      public static void main(String[] args) {	  
    	  A052 tree = new A052();
    	  tree.root = new TreeNode(1);
		  tree.root.left = new TreeNode(2);
		  tree.root.right = new TreeNode(3);
		  tree.root.left.left = new TreeNode(4);
		  tree.root.left.right = new TreeNode(5);
		  tree.root.right.left = new TreeNode(6);
		  tree.root.right.right = new TreeNode(7);
		  tree.root.right.left.left = new TreeNode(8);
		  tree.root.right.right.right = new TreeNode(9);
		  if(tree.isCompleteTree(root)) {
			  System.out.println("YES");
		  }else {
			  System.out.println("NO");
		  }
      }
}

