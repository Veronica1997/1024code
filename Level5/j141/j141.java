//ʹ��contains�����жϼ������Ƿ����ĳԪ��
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
