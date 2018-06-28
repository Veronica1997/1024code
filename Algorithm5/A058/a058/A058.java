package a058;

//翻转链表|第1部分(迭代解决方案)
/*输入一组数据，创建一个链表，编写方法将链表反转。不得使用java中已有的LinkedList。链表节点个数是5个。
输入：1 2 3 4 5
输出：5->4->3->2->1->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class A058 {
	static Node head = null;
	static Node tem = null;

	public void addNode(int d) {
		Node n = new Node(d);
		if (head == null) {
			head = n;
			return;
		}
		tem = head;
		while (tem.next != null) {
			tem = tem.next;
		}
		tem.next = n;
	}

	public static Node reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node temp = head.next;
		Node reversedHead = reverse(head.next);
		// 获取先前的下一个节点，让该节点指向自身
		temp.next = head;
		// 破坏以前自己指向下一个节点
		head.next = null;
		// 层层传递给最上面的
		return reversedHead;
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		A058 it = new A058();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		scanner.close();
		Node tem = it.reverse(head);
		for (int i = 0; i < 5; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
	}
}
