import java.io.Serializable;


/*
                 һ����Ķ���Ҫ�����л��ɹ���������������������
                �������ʵ�� java.io.Serializable ����
                ������������Ա����ǿ����л��ġ������һ�����Բ��ǿ����л��ģ�
                    ������Ա���ע���Ƕ��ݵġ�
                �������֪��һ��Java��׼���Ƿ��ǿ����л��ģ���鿴������ĵ���
                ����һ�����ʵ���Ƿ������л�ʮ�ּ򵥣� ֻ��Ҫ�鿴������û��
                ʵ��java.io.Serializable�ӿڡ�
 */

public class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}