package a067;

//Floor and Ceil in a Binary Search Tree 二叉搜索树中的Floor和Ceil
/*给定一个BST，找到一个给定key值的ceil和floor。 如果给定key值在BST中，那么floor和ceil都等于键，否则ceil等于BST中的下一个更大的键（如果有的话），并且floor等于BST中的前一个更大的键（如果有的话）。
例如，考虑下面的树
      8
    /   \
   4     10
 /  \   /    \
2   6 9    12
1的floor不存在，1的ceil是2
3的floor是2，3的ceil是4
9的floor是9，9的ceil是9
7的floor是6，7的ceil是8
输入：3
输出：2 4
输入：1
输出：x的floor不存在 2*/
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
			System.out.print(k + "的floor不存在" + " ");
		}
		if (floorceil[1] != -1) {
			System.out.print(floorceil[1]);
		} else {
			System.out.print(k + "的ceil不存在");
		}
	}
}
