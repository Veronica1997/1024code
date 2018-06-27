/*给定一个二叉树，打印每个具有负斜率（\）的对角线的所有节点。假设节点的左，右子与父节点成45度角。 
                   1
                /    \
               2      3
              /  \   /   \
             4   5 6   7
                    /       \
                   8       9
输出：
1 3 7 9 
2 5 6 
4 8
*/
import java.util.*;

class TreeNod{
	int root;
	TreeNod left,right;
	TreeNod(int root){
		this.root = root;
		left = right = null;
	}
}

public class A053 {
  public void printTree(TreeNod root) {
	  Queue<TreeNod> queue = new java.util.LinkedList<>();
	  if(root == null)   return;
		  queue.add(null);
		  do {
			  while(root != null) {
				  if(root.left != null)
					  queue.add(root.left);
				  System.out.print(root.root+" ");
				  root=root.right;
			  }
			  if(!queue.isEmpty()) {
				  root = queue.remove();
				  if(root == null) {
					  System.out.println();
					  if(!queue.isEmpty()) {
						  root = queue.remove();
					  }else break;
					  queue.add(null);
				  }
			  }
		  }while(!queue.isEmpty());
  }
  TreeNod root;
  public static void main(String[] args) {
		A053 tree = new A053();
		tree.root = new TreeNod(1);
		  tree.root.left = new TreeNod(2);
		  tree.root.right = new TreeNod(3);
		  tree.root.left.left = new TreeNod(4);
		  tree.root.left.right = new TreeNod(5);
		  tree.root.right.left = new TreeNod(6);
		  tree.root.right.right = new TreeNod(7);
		  tree.root.right.left.left = new TreeNod(8);
		  tree.root.right.right.right = new TreeNod(9);
		  tree.printTree(tree.root);
	}
}

