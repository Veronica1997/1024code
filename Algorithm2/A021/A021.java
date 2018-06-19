
//插值搜索
/*通过比较插值搜索在每个搜索步骤中，基于搜索空间的低值和高值以及目标值计算目标可能存在的剩余搜索空间的哪里。 
 * 然后将在该估计位置实际发现的值与目标值进行比较。 如果不相等，则根据比较，剩余的搜索空间减少到估计位置之前或之后的部分。
 * 输入个数为5
输入：
2 3 5 7 9
7
输出：Element found at index 3*/
import java.util.*;

public class A021 {

	public static int search(int[] arr, int key, int left, int right) {
		while (left < right) {
			int middle = left + (right - left) * ((key - arr[left]) / (arr[right] - arr[left]));
			if (arr[middle] == key) {
				return middle;
			}
			if (key < arr[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		int m = input.nextInt();
		input.close();
		if (search(a,m,0,a.length - 1) != -1)
			System.out.println("Element found at index " + +search(a,m,0,a.length - 1));
		else
			System.out.println("Element not present");
	}

}
