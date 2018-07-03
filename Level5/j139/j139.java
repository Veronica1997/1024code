import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Ê¹ÓÃListIteratorÄæĞò±éÀúArrayList
public class j139 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		ListIterator<Integer> li = list.listIterator();
		for (li = list.listIterator(); li.hasNext();) {
			li.next();
		}
		for (; li.hasPrevious();) {
			System.out.print(li.previous() + " ");
		}
	}
}
