package a055;

//������˳����������������������
/*����һ�����ݣ�����һ��������дһ�����������������Ľڵ㣬ʹ���ǰ��յ�����˳��������� ���仰˵��������������ʹ��java���е�LinkedLsit���������Ϊ6
���룺6 3 4 8 2 9
�����
6->3->4->8->2->9->null
2->3->4->6->8->9->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data; 
	}
}

public class A055 {
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

	// ð������
	public static Node bulleSort(Node head) {
		if (head == null || head.next == null)
			return head;
		Node cur = null;
		Node tail = null;
		cur = head;
		while (cur.next != tail) {
			while (cur.next != tail) {
				if (cur.data > cur.next.data) {
					int temp = cur.data;
					cur.data = cur.next.data;
					cur.next.data = temp;
				}
				cur = cur.next;
			}
			tail = cur;
			cur = head;
		}
		return head;
	}

	public static void main(String[] args) {
		int[] array = new int[6];
		A055 it = new A055();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		scanner.close();
		// ԭ���
		tem = head;
		for (int i = 0; i < 6; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		tem = head;
		// �������
		A055.bulleSort(tem);
		for (int i = 0; i < 6; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
	}
}
