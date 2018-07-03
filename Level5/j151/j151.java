import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class j151 {
	public static void main(String[] args){
		//List<Integer> list = new ArrayList<Integer>();
		/*list.add(1);
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(20);
		list.add(14);*/
		List<Integer> intList = Arrays.asList(1,10,5,7,6,2,9,20,14);
		Collections.sort(intList);
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i)+" ");
		}
       // System.out.println("hello word!"); 
    }
}
