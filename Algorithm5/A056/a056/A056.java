package a056;

//�����������ֳ������б�����ÿ���б��������Ԫ��
/*����һ�����ݣ�������������һ������������Ϊ��������������ÿ���������������ԭʼ�����е�Ԫ�ء� �������е�Ԫ�ؿ������κ�˳�����磬���ԭʼ�б���{a��b��a��b��a}����ôһ�����б�Ӧ����{a��a��a}����һ��Ӧ����{b��b}��
���룺1 2 3 4 5 6 7
�����
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
		// ԭ���
		tem = head;
		for (int i = 0; i < 7; i++) {
			System.out.print(tem.data + "->");
			tem = tem.next;
		}
		System.out.print("null");
		System.out.println();
		// ��һ��������
		
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
		// �ڶ���������
		tem = head.next;
		for (int i = 1; i < 7; i += 2) {
			System.out.print(tem.data + "->");
			tem = tem.next.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
