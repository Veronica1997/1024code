
//������������x��n������n�ǷǸ��ģ��÷����㷨ʵ���ݺ���x^n��ֵ��
import java.util.*;

public class A016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = input.nextInt();
		input.close();
		int i=1,r=1;
		while(i<=n) {
			r*=x;
			i++;
		}			
		System.out.println(r);
	}
}
