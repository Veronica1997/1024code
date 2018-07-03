import java.util.Collection;
import java.util.HashSet;

public class j160 {
	public static void main(String[] args) {
		Collection<String> c = new HashSet<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		for (String str : c) {
			System.out.print(str.toUpperCase()+" ");
		}
	}
}
