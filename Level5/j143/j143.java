
//统计一句话中字符的个数
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j143 {
	public static void main(String[] args) {
		j143 st = new j143();
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] sstr = str.toCharArray();
		List list = new ArrayList();
		for (int i = 0; i < sstr.length; i++) {
			if ((sstr[i] >= 'A' && sstr[i] <= 'Z' || sstr[i] >= 'a' && sstr[i] <= 'z')) {
				char strTemp = sstr[i];
				if (!list.contains(strTemp)) {
					list.add(strTemp);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			char strTemp = (char) list.get(i);
			System.out.println(strTemp + "==" + st.countWords(sstr, strTemp));
		}

	}

	public int countWords(char[] sstr, char strTemp) {
		int num = 0;
		for (int i = 0; i < sstr.length; i++) {
			char s = sstr[i];
			if (s == strTemp) {
				num++;
			}
		}
		return num;
	}
}
