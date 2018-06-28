package a056;

//将给定链表拆分成两个列表，其中每个列表包含交替元素
/*输入一组数据，创建链表，给定一个链表，将其拆分为两个子链表，其中每个子链表都交替包含原始链表中的元素。 新链表中的元素可以是任何顺序。例如，如果原始列表是{a，b，a，b，a}，那么一个子列表应该是{a，a，a}，另一个应该是{b，b}。
输入：1 2 3 4 5 6 7
输出：
1->2->3->4->5->6->7->null
1->3->5->7->null
2->4->6->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}
}

public class A056 {
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
		int[] array = new int[7];
		A056 it = new A056();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		scanner.close();
		// 原输出
		tem = head;
		for (int i = 0; i < 7; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		// 第一个子链表
		
		A056 itsub1 = new A056();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j += 2) {
				itsub1.addNode(array[j]);
			}
		}
		
		tem = head;
		for (int i = 0; i < 7; i += 2) {
			System.out.print(tem.data + "->");
			tem = tem.next.next;
		}
		System.out.print("null");
		System.out.println();
		// 第二个子链表
		tem = head.next;
		for (int i = 1; i < 7; i += 2) {
			System.out.print(tem.data + "->");
			tem = tem.next.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
