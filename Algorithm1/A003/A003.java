import java.util.Scanner;
//ʹ��ð�������������������������ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ����������߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ��������Ϊ7
public class A003 {
	public static void main(String[] args){
        int a[]=new int[7]; 
        Scanner input = new Scanner(System.in);
        for(int k=0;k<a.length;k++) {
        	a[k]=input.nextInt();
        }	 
        int temp=0;//�м�ֵ
        //-------ð������
        //���ѭ��,������һ���߼���
        for(int i = 0;i<a.length-1;i++){
            //�ڲ�ѭ��,��ʼ����Ƚ�
            //������Ƿ���ǰһ�����Ⱥ�һ������,�򽻻�
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    //��λ
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
    }
        for(int n=0;n<a.length;n++) {
        	System.out.print(a[n]+" ");
        }
    }
}
