
import java.util.Comparator;

public class ComparatorSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (((cell) o1).geta() > ((cell) o2).geta())
			return 1;
		else
			return 0;	
	}
}