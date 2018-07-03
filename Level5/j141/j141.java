//使用contains方法判断集合中是否包含某元素
import java.util.*;
public class j141 {
	public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       List<Integer> list = new ArrayList<Integer>();
       for(int i=0;i<10;i++) {
    	   list.add(input.nextInt());
       }
		int m=input.nextInt();
        System.out.println(list.contains(m)); 
    }
}
