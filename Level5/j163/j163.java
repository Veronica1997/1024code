import java.util.ArrayList;
import java.util.List;

public class j163 {
	 public static void main(String[] args) {
	        /*案例  使用List接口提供的subList方法获取子List*/
	        /*1） 创建List接口的引用list，使该引用指向ArrayList的实例；
	        将0~9十个数字作为十个元素放入到集合list中，并输出集合list。*/
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0; i<10; i++){
	            list.add(i);
	        }
	        System.out.println("list集合:"+list);

	        //2） 获取list集合的子集合subList，subList子集合的元素为[3, 4, 5, 6, 7]并输出子集合subList。
	        List<Integer> subList = list.subList(3, 8);
	        System.out.println("subList集合:"+subList);

	        /*3） 将subList集合中的每一个元素扩大10倍，输出list集合和subList集合，
	        验证subList获得的List集合和源List集合占用相同的数据空间。*/
	        for(int i=0; i<subList.size(); i++){
	            subList.set(i, subList.get(i)*10);
	        }
	        System.out.println("subList扩大10倍后: "+subList);
	        System.out.println("list集合: "+list);
	        /*    输出结果:
	         *     subList扩大10倍后: [30, 40, 50, 60, 70]
	            list集合: [0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
	         */

	        //4） 清除list集合中索引位置为3～7（包含3和7）的元素，并输出list。
	        list.subList(3, 8).clear();
	        System.out.println("list清除3~7位置后的集合:"+list);
	    }
}
