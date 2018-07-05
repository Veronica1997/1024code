package a066;
//Find Lowest Common Ancestor (LCA) of two nodes in a Binary Search Tree ����BST�������ڵ����͹������ȣ�LCA��
/*����һ��BST�������ڵ�x��y���ҵ�x��y����͹�ͬ���ȣ�LCA��.����15 10 20 8 12 16 25������һ����������ڵ��Ǳ��𸸽ڵ����Һ��ӣ�С�����ӡ����������ڵ�鿴������͹�ͬ����
���룺
15 10 20 8 12 16 25
20 10
�����15*/

//����һ��
import java.util.Scanner;

class Node {
 int data;
 Node left, right, nextRight;

 Node(int item) {
  data = item;
  left = right = nextRight = null;
 }

 public void setLeft(Node left) {
  this.left = left;
 }

 public void setRight(Node right) {
  this.right = right;
 }

 public void insertNode(int data) {
  if (this.data <= data)
   if (this.right == null)
    this.setRight(new Node(data));
   else
    this.right.insertNode(data);
  if (this.data > data)
   if (this.left == null)
    this.setLeft(new Node(data));
   else
    this.left.insertNode(data);
 }
}

public class A066{
 Node root;

 public void insert(int data) {
  if (root == null)
   root= new Node(data);
  else
   root.insertNode(data);
 }
    public boolean isBeing(Node root,int x){
     if(root == null)
      return false;
     if(root.data == x)
      return true;
     if(x < root.data)
      return isBeing(root.left,x);
     if(x > root.data)
      return isBeing(root.right,x);
     return false;
    }
 // ����BST������ֵ����͹�ͬ����
 public Node lCA(Node root, int x, int y) {
  if (root == null)
   return null;
  // �����С�ڸýڵ㣬������������
  if (x < root.data && y < root.data)
   return lCA(root.left, x, y);
  // ��������ڸýڵ㣬������������
  if (x > root.data && y > root.data)
   return lCA(root.right, x, y);
  return root;
 }

 public static void main(String args[]) {
 
  Scanner sc = new Scanner(System.in);
   A066 tree = new A066();
  int[] arr = new int[7];
  for(int i = 0;i < 7;i++)
   arr[i] = sc.nextInt();
  int n = arr.length;
  int x = sc.nextInt();
  int y = sc.nextInt();
  for (int i = 0; i < n; i++)
   tree.insert(arr[i]);
  if(tree.isBeing(tree.root, x) && tree.isBeing(tree.root, y))
  System.out.println(tree.lCA(tree.root, x, y).data);
  else 
   System.out.println("no");
}
}

/*��������

import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data = data;
		left = right =null;
	}
}
public class Test1 {
	  public static Node insert(Node root ,int key) {
		   if(root == null) {
			   return new Node(key);
		   }
		   if(key < root.data) {
			   root.left = insert(root.left,key);
		   }else {
			   root.right = insert(root.right,key);
		   }
		   return root;
	   }
	public static boolean search(Node root,int key) {
		while(root != null) {
			if(key < root.data) {
				root = root.left;
			}else if (key > root.data) {
				root = root.right;
			}else {
				return true;
			  }
			}
		return false;
		}
	public static Node LCARe(Node root, int x ,int y) {
		if(root == null) return null;
		if(root.data > Integer.max(x, y)) {
			return LCARe(root.left,x,y);
		}else if(root.data < Integer.min(x, y)) {
			return LCARe(root.right,x,y);
		}
		return root;	
	}
	public static void LCA(Node root,int x,int y) {
		if(root == null || !search(root,x) || !search(root,y)) return;
		Node lca = LCARe(root,x,y);
		if(lca != null) {
			System.out.println(lca.data);
		}else {
			System.out.println("LCA don't exist");
		}
	}
	 public static void main (String[] args) {
		 Node root = null;
		 int[] keys = new int[7];
		 Scanner scanner = new Scanner(System.in);
		 for(int i=0;i<keys.length;i++) {
			 keys[i] = scanner.nextInt();
		 }
		 for(int key : keys) {
			 root = insert(root,key);
		 }
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();
		 scanner.close();
		  LCA(root,x,y);
	 }
}
*/