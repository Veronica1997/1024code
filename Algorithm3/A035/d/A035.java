package d;
//����һ����������дһ����Ч���㷨������Ӹ��ڵ㵽ÿ��Ҷ�ڵ������·����
import java.util.LinkedList;  

class TreeNode {
	 int data;
	 TreeNode left, right;
	 TreeNode(int item) {
	  data = item;
	  left = right = null;
	 }
	}

public class A035 {  
    public static void getPath(TreeNode root){  
        if(root==null) return;  
        LinkedList<TreeNode> list = new LinkedList<>();  
        getpathcore(root,list);  
    }  
    private static void getpathcore(TreeNode root, LinkedList<TreeNode> list) {  
        if(root==null) return;  
        list.add(root);  
        if(root.left==null&&root.right==null){  
            for(TreeNode temp:list){  
                System.out.print(temp.data+" ");  
            }  
            System.out.println();  
            list.removeLast();  
            return;  
        }  
        getpathcore(root.left,list);  
        getpathcore(root.right,list);  
        list.removeLast();//����ʱһ��Ҫ���  
          
    }  
    public static void main(String[] args) {  
          
        TreeNode root = new TreeNode(1);  
        root.left = new TreeNode(2);  
        root.right = new TreeNode(3);  
        root.left.left = new TreeNode(4);  
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        System.out.println("��4���Ӹ��ڵ㵽Ҷ�ӽڵ��·��: ");
        getPath(root);  
    }  
}  

