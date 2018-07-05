package a087;

//给出二进制矩形矩阵形式的迷宫，从给定的源找到迷宫中最短路径的长度给予目的地。 该路径只能从具有值1的单元格中构造，并且在任何给定的时刻，我们只能在四个方向中的一个方向上移动一步。
import java.util.*;

public class A087 {
	private static final int M = 10;
	private static final int N = 10;

	public static boolean isSafe(int[][] matrix, int[][] visited, int x, int y) {
		return !(matrix[x][y] == 0 || visited[x][y] != 0);
	}

	private static boolean isValid(int x, int y) {
		return (x < M && y < N && x >= 0 && y >= 0);
	}

	public static int shortPath(int[][] matrix, int[][] visited, int i, int j, int x, int y, int min_dis, int dis) {
		if (i == x && j == y) {
			return Integer.min(dis, min_dis);
		}
		visited[i][j] = 1;
		if (isValid(i + 1, j) && isSafe(matrix, visited, i + 1, j)) {
			min_dis = shortPath(matrix, visited, i + 1, j, x, y, min_dis, dis + 1);
		}
		if (isValid(i, j + 1) && isSafe(matrix, visited, i, j + 1)) {
			min_dis = shortPath(matrix, visited, i, j + 1, x, y, min_dis, dis + 1);
		}
		if (isValid(i - 1, j) && isSafe(matrix, visited, i - 1, j)) {
			min_dis = shortPath(matrix, visited, i - 1, j, x, y, min_dis, dis + 1);
		}
		if (isValid(i, j - 1) && isSafe(matrix, visited, i, j - 1)) {
			min_dis = shortPath(matrix, visited, i, j - 1, x, y, min_dis, dis + 1);
		}
		visited[i][j] = 0;
		return min_dis;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 } };
		Scanner scanner = new Scanner(System.in);
		int xs = scanner.nextInt();
		int ys = scanner.nextInt();
		int xe = scanner.nextInt();
		int ye = scanner.nextInt();
		scanner.close();
		int[][] visited = new int[M][N];
		int min_dis = shortPath(matrix, visited, xs, ys, xe, ye, Integer.MAX_VALUE, 0);
		if (min_dis != Integer.MAX_VALUE) {
			System.out.println(min_dis);
		} else {
			System.out.println("Destination can't be reached from source");
		}
	}
}