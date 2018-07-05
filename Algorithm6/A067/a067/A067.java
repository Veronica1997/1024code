package a067;

//Floor and Ceil in a Binary Search Tree �����������е�Floor��Ceil
/*����һ��BST���ҵ�һ������keyֵ��ceil��floor�� �������keyֵ��BST�У���ôfloor��ceil�����ڼ�������ceil����BST�е���һ������ļ�������еĻ���������floor����BST�е�ǰһ������ļ�������еĻ�����
���磬�����������
      8
    /   \
   4     10
 /  \   /    \
2   6 9    12
1��floor�����ڣ�1��ceil��2
3��floor��2��3��ceil��4
9��floor��9��9��ceil��9
7��floor��6��7��ceil��8
���룺3
�����2 4
���룺1
�����x��floor������ 2*/
import java.util.Scanner;

class Nodes {
	int data;
	Nodes left;
	Nodes right;

	Nodes(int data) {
		this.data = data;
		right = left = null;
	}
}

public class A067 {
	Nodes root;

	public static int[] findFloorCeil(Nodes root, int key) {
		int[] floorceil = new int[2];
		floorceil[0] = -1;
		floorceil[1] = -1;
		while (root != null) {
			if (root.data == key) {
				floorceil[0] = root.data;
				floorceil[1] = root.data;
				break;
			} else if (key < root.data) {
				floorceil[1] = root.data;
				root = root.left;
			} else {
				floorceil[0] = root.data;
				root = root.right;
			}
		}
		return floorceil;
	}

	public static void main(String[] args) {
		A067 tree = new A067();
		tree.root = new Nodes(8);
		tree.root.left = new Nodes(4);
		tree.root.right = new Nodes(10);
		tree.root.left.left = new Nodes(2);
		tree.root.left.right = new Nodes(6);
		tree.root.right.left = new Nodes(9);
		tree.root.right.right = new Nodes(12);
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.close();

		int[] floorceil = findFloorCeil(tree.root, k);
		if (floorceil[0] != -1) {
			System.out.print(floorceil[0] + " ");
		} else {
			System.out.print(k + "��floor������" + " ");
		}
		if (floorceil[1] != -1) {
			System.out.print(floorceil[1]);
		} else {
			System.out.print(k + "��ceil������");
		}
	}
}
