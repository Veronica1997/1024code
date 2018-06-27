/*����һ���������ҵ�ͨ�������������滻Ӣ����ĸ����Ӧ�ַ��γɵ����п��ܵ���ϡ� ���Ӽ�{1}������A���棬{2}���Ա�B���棬{1��0}����
�滻J��{2,1}�����滻U�ȡ��������wΪ4
���磬
���룺1 2 2 1
�����
ABBA
ABU
AVA
LBA
LU

ԭ��
{1��2��2��1} = ABBA
{1��2��21} = ABU
{1��22��1} = AVA
{12��2��1} = LBA
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
