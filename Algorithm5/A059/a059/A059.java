package a059;

//�ҵ�����ĵ�����K���ڵ�
/*����һ�����ݣ�����һ����������һ��������K�����������ҵ�������K���ڵ㡣����ʹ��java�����е�linkedlist������ڵ����Ϊ5��������K=3
���룺1 2 3 4 5
�����3*/
import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class A059 {
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

	public static void main(String[] args) {
		int[] array = new int[5];
		A059 it = new A059();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		scanner.close();
		Node tem = it.head;
		for (int i = 0; i < 5; i++) {
			while (i == 2) {
				System.out.print(tem.data);
				break;
			}
			tem = tem.next;
		}
	}
}
