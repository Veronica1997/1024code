import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//ʹ��ͨ�����ǿ����
public class j147 {
    public static Object getMiddle(List<? extends Number> list) {
        return list.get(list.size() / 2);
    }
    
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        System.out.print("�����б��Ԫ�أ�");
        System.out.println(Arrays.toString(ints.toArray()));
        System.out.println("�����б���м�����" + getMiddle(ints));
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        System.out.print("�����б��Ԫ�أ�");
        System.out.println(Arrays.toString(doubles.toArray()));
        System.out.println("�����б���м�����" + getMiddle(doubles));
    }
}
