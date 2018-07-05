import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class j207 {
	/*
	���л�����
	    ObjectOutputStream ���������л�һ���������µ�SerializeDemo����ʵ������һ��Employee���󣬲����ö������л���һ���ļ��С�
	    �ó���ִ�к󣬾ʹ�����һ����Ϊemployee.ser�ļ����ó���û���κ���������������ͨ�������ж�������������á�
	    ע�⣺ �����л�һ�������ļ�ʱ�� ����Java�ı�׼Լ���Ǹ��ļ�һ��.ser��չ����
	*/

	   public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      /*
	      �����л�����
	          �����DeserializeDemo����ʵ���˷����л���/tmp/employee.ser�洢��Employee����
	      */
	      Employee e2 = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e2 = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e2.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e2.SSN);
	      System.out.println("Number: " + e2.number);
	   }
	}                

