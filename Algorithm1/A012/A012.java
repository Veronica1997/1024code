//�ҵ��������ȵ����в�ͬ���
/*����һ���̶����ȵ���������{1��2��3,1}���ҵ���������������Ե�������ϣ�������˳�������
 * �������Ժ�������ԡ���дһ�δ��룬�������к󣬿�������������һ���Ĵ𰸡�����Ҫ���룬ֻ�������*/
import java.util.*;
public class A012 {
	public static void main(String[] args){
        int[] a= {1,2,3,1};
        Arrays.sort(a);
        
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		Integer[] b = list.toArray(new Integer[list.size()]);
		
		for(int i=0;i<b.length;i++) {
			for(int j=i;j<b.length;j++) {
				System.out.println(b[i] + " "+b[j]);
			}
		}
        
    }
}
