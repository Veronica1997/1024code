import java.util.ArrayList;
import java.util.List;

public class j163 {
	 public static void main(String[] args) {
	        /*����  ʹ��List�ӿ��ṩ��subList������ȡ��List*/
	        /*1�� ����List�ӿڵ�����list��ʹ������ָ��ArrayList��ʵ����
	        ��0~9ʮ��������Ϊʮ��Ԫ�ط��뵽����list�У����������list��*/
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0; i<10; i++){
	            list.add(i);
	        }
	        System.out.println("list����:"+list);

	        //2�� ��ȡlist���ϵ��Ӽ���subList��subList�Ӽ��ϵ�Ԫ��Ϊ[3, 4, 5, 6, 7]������Ӽ���subList��
	        List<Integer> subList = list.subList(3, 8);
	        System.out.println("subList����:"+subList);

	        /*3�� ��subList�����е�ÿһ��Ԫ������10�������list���Ϻ�subList���ϣ�
	        ��֤subList��õ�List���Ϻ�ԴList����ռ����ͬ�����ݿռ䡣*/
	        for(int i=0; i<subList.size(); i++){
	            subList.set(i, subList.get(i)*10);
	        }
	        System.out.println("subList����10����: "+subList);
	        System.out.println("list����: "+list);
	        /*    ������:
	         *     subList����10����: [30, 40, 50, 60, 70]
	            list����: [0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
	         */

	        //4�� ���list����������λ��Ϊ3��7������3��7����Ԫ�أ������list��
	        list.subList(3, 8).clear();
	        System.out.println("list���3~7λ�ú�ļ���:"+list);
	    }
}
