//反转给定的句子，而不反转单个单词
public class A050 {
	public static String reverse(String s) {
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				pos = 0;
			}
			sb.insert(pos, c);
			if (c != ' ') {
				pos++;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String sb = "We provide good material for IT Technical Interview preparation";
		System.out.println(reverse(sb));
	}
}
