import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class j166 {

	public static Map<Integer, String> map;
	static {
		map = new HashMap<Integer, String>();
		for (int i = 0; i < 1000000; i++) {
			map.put(3 * i + 1, "China");
			map.put(3 * i + 2, "America");
			map.put(3 * i + 3, "Japan");
		}
	}

	public static void main(String[] args) {
		System.out.println("map keySet ellipse " + MapKeySetMethod() + " ms");
		System.out.println("map entrySet ellipse " + MapEntrySetMethod() + " ms");
		// Ϊ���ų���ν�Ļ�������ĸ��ţ������ٶ�ִ�м���
		System.out.println("map keySet ellipse " + MapKeySetMethod() + " ms");
		System.out.println("map entrySet ellipse " + MapEntrySetMethod() + " ms");
		System.out.println("map keySet ellipse " + MapKeySetMethod() + " ms");
		System.out.println("map entrySet ellipse " + MapEntrySetMethod() + " ms");
		System.out.println("map keySet ellipse " + MapKeySetMethod() + " ms");
		System.out.println("map entrySet ellipse " + MapEntrySetMethod() + " ms");

		// ��ֻҪ��ȡ��value��ʱ�������ô��
		Collection<String> values = map.values();
		for (String str : values) {
			// System.out.println(str);
		}
	}

	public static long MapKeySetMethod() {
		long startTime = System.currentTimeMillis();
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String value = map.get(key);
			// System.out.println(key + " = " + value);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static long MapEntrySetMethod() {
		long startTime = System.currentTimeMillis();
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			// System.out.println(key + " = " + value);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
