
import java.util.ArrayList;
import java.util.Collection;

public class j152 {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("��");
		c1.add("��");
		c1.add("ѧ");
		c1.add("���");
		Collection<String> c2 = new ArrayList<String>();
		c2.add(";");
		c2.add("PHP");
		c2.add("Webǰ��");
		c1.addAll(c2);
		System.out.println(c1);
		Collection<String> c3 = new ArrayList<String>();
		c3.add(";");
		c3.add("PHP");
		System.out.println(c3);
		System.out.println(c1.containsAll(c3) ? "yes" : "no");
	}
}
