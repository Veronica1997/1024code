
//Èı·ÖËÑË÷
import java.util.*;

public class A019 {
	public static int tSearch(int[] a, int l, int r, int m) {
		int mid1 = 1 + (r - 1) / 3;
		int mid2 = l + (r - l) * 2 / 3;
		if (a[mid2] < m)
			return tSearch(a,mid2 + 1, r, m);
		else if (a[mid1] < m && a[mid2] > m)
			return tSearch(a,mid1 + 1, mid2 - 1, m);
		else if (a[mid1] > m)
			return tSearch(a,l, mid1 - 1, m);
		else if (a[mid1] == m)
			return mid1;
		else if (a[mid2] == m)
			return mid2;
		else
			return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m = input.nextInt();
		input.close();
		if (tSearch(a,0, a.length - 1, m) != -1)
			System.out.println("Element found at index " + tSearch(a,0, a.length - 1, m));
		else
			System.out.println("Element not present");
	}
}
