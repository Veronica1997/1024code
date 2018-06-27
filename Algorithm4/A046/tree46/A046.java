package tree46;
/*给定一个二叉树和一个节点，写一个有效的算法来找到与给定节点相同级别的下一个节点。   
                                                                             1
                                                                           /    \
                                                                          2      3 
                                                                         /  \   /   \
                                                                        4   5 6   7
                                                                       /              \
                                                                      8              9
输入：5
输出：6
输入：9
输出：null*/
import java.util.Scanner;

class TreeNodes{
	int data;
	TreeNodes left,right;
	TreeNodes(int item) {
		  data = item;
		  left = right = null;
		 }
}

public class A046 {
	TreeNodes root;
    static	boolean flag = false;
    static int value =0;
    public static TreeNodes findNode(TreeNodes root,int level,int data){
	  if(root == null) return null;
	  if(flag && level == value) {
		  return root;
	    }
	  if(root.data == data) {
		  flag = true;
		  value = level;
		  return null;
	    }
	  TreeNodes node =findNode( root.left,  level + 1,  data);
	  if(node != null) return node;
	   return findNode( root.right,  level + 1,  data);
	  }
  public static void main(String args[]) {	
	      Scanner scanner =new Scanner(System.in);
	      int n = scanner.nextInt();
	      scanner.close();
		  A046 tree = new A046();
		  tree.root = new TreeNodes(1);
	      tree.root.left = new TreeNodes(2);
	      tree.root.right = new TreeNodes(3);
	      tree.root.left.left = new TreeNodes(4);
	      tree.root.left.right = new TreeNodes(5);
	      tree.root.right.left = new TreeNodes(6);
	      tree.root.right.right = new TreeNodes(7);
	      tree.root.left.left.left = new TreeNodes(8);
	      tree.root.right.right.right= new TreeNodes(9);
	      if(tree.findNode(tree.root,1,n)!=null ) {
	    	  value = 0;	    	  
		      System.out.println(findNode(tree.root,1,n).data);
	      }else {	    	  
		      System.out.println("null");
	      }
	 }
}
