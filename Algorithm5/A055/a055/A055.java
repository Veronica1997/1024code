package a055;

//按递增顺序重新排列链表（排序链表）
/*输入一组数据，创建一个链表，编写一个函数重新排列它的节点，使它们按照递增的顺序进行排序。 换句话说，排序链表，不得使用java已有的LinkedLsit，链表个数为6
输入：6 3 4 8 2 9
输出：
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

	// 冒泡排序
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
		// 原输出
		tem = head;
		for (int i = 0; i < 6; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		tem = head;
		// 排序输出
		A055.bulleSort(tem);
		for (int i = 0; i < 6; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
	}
}
