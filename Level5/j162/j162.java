import java.util.ArrayList;
import java.util.List;

public class j162 {
	public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("java");
        list.add("c#");
        list.add(1, "cpp");
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
    }
}
