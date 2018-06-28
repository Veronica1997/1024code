
//在给定的排序链表中插入一个给定节点到正确排列的位置
/*输入一个升序排列的链表以及一个单个节点，将该节点插入到链表中正确排列的位置中。程序应该取一个已经存在的节点，仅通过重新排列指针以将其插入链表。不得使用Java已有的LinkedList。
输入：
1 2 3 4
5
输出：
1->2->3->4->null
1->2->3->4->5->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next = null;// 节点指针域

	public Node(int data) {
		this.data = data; // 当构造一个新的节点时候，顺便对节点进行初始化
	}
}

public class A054 {
	static Node head = null;
	static Node tem = null;

	public void addNode(int d) {
		Node n = new Node(d);
		if (head == null) {
			head = n;
			return;
		}
		tem = head;// 一般链表的头结点是不能动，因此需要把头结点赋值给一个临时变量
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
		int[] array = new int[4];
		A054 it = new A054();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			array[i] = scanner.nextInt();
			it.addNode(array[i]);
		}
		int n = scanner.nextInt(); // 注意n输入的位置
		scanner.close();
		// 原输出
		tem = head;
		for (int i = 0; i < 4; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		// 插入排序输出
		it.addNode(n);
		tem = head;
		A054.bulleSort(tem);
		for (int i = 0; i < 5; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
	}
}
