package a057;
//ͨ������ϲ����������б��еĽڵ�������һ��������
/*��������������дһ����������ÿ�����������θ�ȡһ���ڵ����һ���µ������磺�����1��2��3��4����5��6��7��8���������1��5��2��6��3��7��4��8��������ʹ��Java�����е�linkedlist������ڵ������4��
���룺
1 2 3 4
1 2 3 4
�����1->1->2->2->3->3->4->4->null*/
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
