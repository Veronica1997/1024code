package a060;

//合并排序单链接列表
/*输入一组数据，创建一个链表，使用合并排序算法排序。
合并排序是一种分治算法。 像所有的分治算法一样，合并排序算法将列表分成两个子列表。 然后它递归地排序每个子列表，最后将两个排序的列表合并在一起形成答案。不能使用java已有的LinkedList。输入的列表为10,5,20,9,3,2
输出：
10->5->20->9->3->2->null
2->3->5->9->10->20->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class A060 {
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
		A060 it = new A060();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		scanner.close();
		Node tem = it.head;
		for (int i = 0; i < 6; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();

		Node temp = it.head;
		A060.bulleSort(temp);
		for (int i = 0; i < 6; i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}
}
