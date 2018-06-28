package a058;

//��ת����|��1����(�����������)
/*����һ�����ݣ�����һ��������д����������ת������ʹ��java�����е�LinkedList������ڵ������5����
���룺1 2 3 4 5
�����5->4->3->2->1->null*/
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
		// ��ȡ��ǰ����һ���ڵ㣬�øýڵ�ָ������
		temp.next = head;
		// �ƻ���ǰ�Լ�ָ����һ���ڵ�
		head.next = null;
		// ��㴫�ݸ��������
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
