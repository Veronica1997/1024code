//��дһ�����׳�IllegalAccessException�쳣
import java.util.Scanner;
public class j129 {
    static void inputException() throws IllegalAccessException //�����쳣IllegalAccessException
    {
        int a[]=new int[3]; //r�������3��Ԫ�ص�����
        Scanner sc=new Scanner(System.in);
        System.out.println("������3����������:");
        int i,sum=0,average;
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i]; //��ȡ3��Ԫ�ص�ֵ���������ܺ�
        }
        System.out.println("���������"); //��������������ܺͳ��Գ���
        average=sc.nextInt();
        average=sum/average;
        System.out.println("average="+average);
        throw new IllegalAccessException(); //�׳���IllegalAccessException

    }
    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
        try //����顰�ල���쳣
        {
            inputException();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("����Խ��"+e); //����Խ���쳣IllegalAccessException
        }
        catch(ArithmeticException e)
        {
            System.out.println("��������Ϊ0"+e); //������ѧ�����쳣ArithmeticException
        }
        catch(IllegalAccessException e)
        {
            System.out.println("�Ƿ���ȡ"+e); //�����쳣Arithmetiception
        }
        finally //finally����飬�����ʾ��Ϣ
        {
            System.out.println("���һ���ᱻִ�е����");
        }

    }

}
