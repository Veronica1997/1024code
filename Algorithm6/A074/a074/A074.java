package a074;
/*给定一组键值对（key->value）1->2,2->3,3->4,4->5,5->6,6->7.要求构建该键值对的B树，插入该组键值对，输入一个数代表key值，输出该主键对应的value值
输入：2
输出：3*/

//B树查找
import java.util.*;

public class A074<Key extends Comparable<Key>, Value> {
	private static final int M = 4;
	private Node root;
	private int height;
	private int n;

	private static final class Node {
		private int m;
		private Entry[] children = new Entry[M];

		private Node(int k) {
			m = k;
		}
	}

	public static class Entry {
		public Comparable<?> key;
		public Object val;
		public Node next;

		public Entry(Comparable<?> key, Object val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}

	public A074() {
    root = new Node(0);
  }

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return n;
	}

	public int height() {
		return height;
	}

	public Value get(Key key) {
		if (key == null) {
			throw new NullPointerException("key must not be null");
		}
		return search(root, key, height);
	}

	@SuppressWarnings("unchecked")
	private Value search(Node x, Key key, int ht) {
		Entry[] children = x.children;
		if (ht == 0) {
			for (int j = 0; j < x.m; j++) {
				if (eq(key, children[j].key)) {
					return (Value) children[j].val;
				}
			}
		} else {
			for (int j = 0; j < x.m; j++) {
				if (j + 1 == x.m || less(key, children[j + 1].key)) {
					return search(children[j].next, key, ht - 1);
				}
			}
		}
		return null;
	}

	public void put(Key key, Value val) {
		if (key == null) {
			throw new NullPointerException("key must not be null");
		}
		Node u = insert(root, key, val, height); // 分裂后生成的右结点
		n++;
		if (u == null) {
			return;
		}
		Node t = new Node(2);
		t.children[0] = new Entry(root.children[0].key, null, root);
		t.children[1] = new Entry(u.children[0].key, null, u);
		root = t;
		height++;
	}

	private Node insert(Node h, Key key, Value val, int ht) {
		int j;
		Entry t = new Entry(key, val, null);
		if (ht == 0) {
			for (j = 0; j < h.m; j++) {
				if (less(key, h.children[j].key)) {
					break;
				}
			}
		} else {
			for (j = 0; j < h.m; j++) {
				if ((j + 1 == h.m) || less(key, h.children[j + 1].key)) {
					Node u = insert(h.children[j++].next, key, val, ht - 1);
					if (u == null) {
						return null;
					}
					t.key = u.children[0].key;
					t.next = u;
					break;
				}
			}
		}

		for (int i = h.m; i > j; i--) {
			h.children[i] = h.children[i - 1];
		}
		h.children[j] = t;
		h.m++;
		if (h.m < M) {
			return null;
		} else { // 分裂结点
			return split(h);
		}
	}

	private Node split(Node h) {
		Node t = new Node(M / 2);
		h.m = M / 2;
		for (int j = 0; j < M / 2; j++) {
			t.children[j] = h.children[M / 2 + j];
		}
		return t;
	}

	public String toString() {
		return toString(root, height, "") + "\n";
	}

	private String toString(Node h, int ht, String indent) {
		StringBuilder s = new StringBuilder();
		Entry[] children = h.children;

		if (ht == 0) {
			for (int j = 0; j < h.m; j++) {
				s.append(indent + children[j].key + " " + children[j].val + "\n");
			}
		} else {
			for (int j = 0; j < h.m; j++) {
				if (j > 0) {
					s.append(indent + "(" + children[j].key + ")\n");
				}
				s.append(toString(children[j].next, ht - 1, indent + "   "));
			}
		}
		return s.toString();
	}

	@SuppressWarnings("unchecked")
	private boolean less(@SuppressWarnings("rawtypes") Comparable k1, @SuppressWarnings("rawtypes") Comparable k2) {
		return k1.compareTo(k2) < 0;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean eq(Comparable k1, Comparable k2) {
		return k1.compareTo(k2) == 0;
	}

	public static void main(String[] args) {
		A074<Integer, Integer> st = new A074<Integer, Integer>();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		st.put(1, 2);
		st.put(2, 3);
		st.put(3, 4);
		st.put(4, 5);
		st.put(5, 6);
		st.put(6, 7);
		System.out.println(st.get(x));
	}
}
