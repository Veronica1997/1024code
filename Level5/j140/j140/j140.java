package j140;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j140 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "С��", 20));
		list.add(new Student(2, "С��", 18));
		list.add(new Student(3, "С��", 19));
		// ʹ��ð�������㷨
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getId() > list.get(j + 1).getId()) {
					Student student = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, student);
				}
			}
		}
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
}
