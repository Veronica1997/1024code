import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class j158 {
	public static void main(String[] args){
		Collection<String> c = new HashSet<String>();
        c.add("java");
        c.add("cpp");
        c.add("php");
        c.add("c#");
        c.add("objective-c");
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.equals("cpp")||str.equals("c#")||str.equals("objective-c")) {
            	it.remove();
            	continue;
            }
            System.out.print(str+" "); 
        }
	}
}