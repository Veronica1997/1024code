//打印二叉树的底视图
//也可以想象为二维数组的有效数字
import java.util.Map;
import java.util.TreeMap;

class Node {
    int data,level;
    Node left, right;
    Node(int item) {
      data = item;
      level = 0;//代表每个节点的级别
      left = right = null;  
  }
}

public class A031 {
      Node root;
      public void printBottom(Node node, int dist, int level,Map<Integer, Node> map){
      if(node == null)
        return;
       node.level = level;//给每个节点级别赋值
      //如果map不包括该列的节点或者在map中的该列节点级别小于传入的同列节点级别，则添加
       if(!map.containsKey(dist) || map.get(dist).level < level)
         map.put(dist, node);
       printBottom(node.left, dist - 1, level + 1,map);
       printBottom(node.right, dist + 1, level + 1,map);
     }
      
     public static void main(String[] args) {
      A031 tree = new A031();
     Map<Integer, Node> map = new TreeMap<>();//TreeMap保证添加进去的顺序
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.printBottom(tree.root, 0, 0, map);
        for (Node value : map.values()) {  
             System.out.print(value.data + " " );  
     }
   }
}

