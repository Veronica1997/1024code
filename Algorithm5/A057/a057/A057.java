package a057;
//通过交替合并两个给定列表中的节点来构建一个新链表
/*创建两个链表，编写一个函数，在每个链表中依次各取一个节点组成一个新的链表。如：输入｛1，2，3，4｝｛5，6，7，8｝。输出｛1，5，2，6，3，7，4，8｝。不得使用Java中已有的linkedlist。链表节点个数是4。
输入：
1 2 3 4
1 2 3 4
输出：1->1->2->2->3->3->4->4->null*/
import java.util.Scanner;
class Node {
	int data ;
	Node next = null;
	public Node(int data) {
		this.data = data; 
	}
}
public class A057 {
	static Node head = null;
	   static Node tem = null;
	   public void addNode(int d) {
		   Node n = new Node(d);
		   if(head == null) {
			   head = n;
			   return;
		   }
		   tem = head;
		   while(tem.next != null) {
			   tem = tem.next;
		   }
		   tem.next = n;
  }
	   public static void main(String[] args) {
		  int[] array1 = new int[4];
		   int[] array2 = new int[4];
		   A057 it = new A057();
		   Scanner scanner = new Scanner(System.in);
		  for(int i=0;i<4;i++) { 
			   array1[i] = scanner.nextInt();
		   }
		   for(int i=0;i<4;i++) { 
			   array2[i] = scanner.nextInt();
		   } 
		   scanner.close();
		   for(int i=0;i<4;i++) {
			   it.addNode(array1[i]);
			   it.addNode(array2[i]);
		   }
		   Node tem = it.head;
		   for(int i=0;i<8;i++) {
			   System.out.print(tem.data+"->");
			   tem  = tem.next;
		   }
		   System.out.print("null"); 
    }
}
