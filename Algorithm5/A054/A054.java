
//�ڸ��������������в���һ�������ڵ㵽��ȷ���е�λ��
/*����һ���������е������Լ�һ�������ڵ㣬���ýڵ���뵽��������ȷ���е�λ���С�����Ӧ��ȡһ���Ѿ����ڵĽڵ㣬��ͨ����������ָ���Խ��������������ʹ��Java���е�LinkedList��
���룺
1 2 3 4
5
�����
1->2->3->4->null
1->2->3->4->5->null*/
import java.util.Scanner;

class Node {
	int data;
	Node next = null;// �ڵ�ָ����

	public Node(int data) {
		this.data = data; // ������һ���µĽڵ�ʱ��˳��Խڵ���г�ʼ��
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
		tem = head;// һ�������ͷ����ǲ��ܶ��������Ҫ��ͷ��㸳ֵ��һ����ʱ����
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
		int n = scanner.nextInt(); // ע��n�����λ��
		scanner.close();
		// ԭ���
		tem = head;
		for (int i = 0; i < 4; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		// �����������
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
