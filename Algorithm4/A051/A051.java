/*输入一组正数，找到通过用连续数字替换英文字母的相应字符形成的所有可能的组合。 即子集{1}可以由A代替，{2}可以被B代替，{1，0}可以
替换J，{2,1}可以替换U等。输入个数w为4
例如，
输入：1 2 2 1
输出：
ABBA
ABU
AVA
LBA
LU

原理：
{1，2，2，1} = ABBA
{1，2，21} = ABU
{1，22，1} = AVA
{12，2，1} = LBA
{12,21} = LU
*/
import java.util.*;

class Nodes{
	String key;
	Nodes left,right;
	Nodes(String key){
		this.key = key;
		left = right =null;
	}
}

public class A051{
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void print(Nodes node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            System.out.println(node.key);
        }
        else{
            print(node.right);
            print(node.left);
        }
    }
    public static void construct(Nodes root, int[] digit, int i){
        if (root == null || i == digit.length) {
            return;
        }
        if (i + 1 < digit.length){
            int sum = 10 * digit[i] + digit[i + 1];
            if (sum <= 26) {
                root.left = new Nodes(root.key + alphabet.charAt(sum - 1));
            }
            construct(root.left, digit, i + 2);
        }
        root.right = new Nodes(root.key + alphabet.charAt(digit[i] - 1));
        construct(root.right, digit, i + 1);
    }
    public static void main(String[] args){
    	Scanner br = new Scanner(System.in);
		int[] b = new int[4];
		for(int i=0;i<b.length;i++) {
			b[i]=br.nextInt();
		}
        Nodes root = new Nodes("");
        construct(root,b,0);
        print(root);
    }
}
