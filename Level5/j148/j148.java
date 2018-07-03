import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class j148 {
	public static void main() {
		ArrayList<cell> cells = new ArrayList<>();
		cell c1 = new cell(2, 3);
		cell c2 = new cell(5, 1);
		cell c3 = new cell(3, 2);
		cells.add(c1);
		cells.add(c2);
		cells.add(c3);
		Collections.sort((List<cell>) cells,new ComparatorSort());
		System.out.println(cells);
	}

}
