package a088;
//Longest Palindromic Subsequence using Dynamic Programming 使用动态编程的最长的回文序列
import java.util.Scanner;
public class A088 {
	 public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        String string = scanner.nextLine();
	        scanner.close();
	        String result = lps(string, 0, string.length() - 1);
	        System.out.println( result.length());
	        System.out.println(result);
	    }

	    public static String lps(String str, int start, int end) {
	        if (start == end) {
	            return str.charAt(end) + "";
	        }
	        if (start > end) {
	            return "";
	        }
	        if (str.charAt(start) == str.charAt(end)) {
	            return str.charAt(start) + lps(str, start + 1, end - 1) + str.charAt(end);
	        } else {
	            String right = lps(str, start + 1, end);
	            String left = lps(str, start, end - 1);
	            int max = max(left.length(), right.length());
	            if (max == left.length()) {
	                return left;
	            } else {
	                return right;
	            }
	        }
	    }
	    public static int max(int x, int y) {
	        return (x > y) ? x : y;
	    }
}

