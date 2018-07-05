package a065;

//方法一：
class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class A065{   
    Node root;
    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
    boolean isBSTUtil(Node node, int min, int max)
    {
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
    public static void main(String args[])
    {
        A065 tree = new A065();
        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(40);

        if (tree.isBST())
            System.out.println("该二叉树是BST");
        else
            System.out.println("该二叉树不是BST");
    }
}


/*方法二：
class TNode{
	int data;
	TNode left =null;
	TNode right = null;
	TNode(int data){
    this.data = data;
   }
}
public class Test1{
   public static TNode insert(TNode root ,int key) {
	   if(root == null) {
		   return new TNode(key);
	   }
	   if(key < root.data) {
		   root.left = insert(root.left,key);
	   }else {
		   root.right = insert(root.right,key);
	   }
	   return root;
   }
   
   public static boolean isBST(TNode node, int minKey, int maxKey) {
	   if(node == null) {
		   return true;
	   }
	   if(node.data < minKey || node.data >maxKey) {
		   return false;
	   }
	   return isBST(node.left,minKey,node.data) && isBST(node.right,node.data,maxKey);
   }
   
   public static void isBST(TNode root) {
	   if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) {
		   System.out.println("该二叉树是BST");
	   }else {
		   System.out.println("该二叉树不是BST");
	   }
   }
   
   private static void swap(TNode root) {
	   TNode left = root.left;
	   root.left = root.right;
	   root.right = left;
   }
   
   public static void main(String[] args) {
	   TNode root = null;
	   int[] keys = {20,10,30,5,40};
	   for(int key:keys) {
		   root = insert(root,key);
	   }
	   swap(root);
	   isBST(root);
   }
}
*/
