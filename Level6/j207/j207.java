import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class j207 {
	/*
	序列化对象
	    ObjectOutputStream 类用来序列化一个对象，如下的SerializeDemo例子实例化了一个Employee对象，并将该对象序列化到一个文件中。
	    该程序执行后，就创建了一个名为employee.ser文件。该程序没有任何输出，但是你可以通过代码研读来理解程序的作用。
	    注意： 当序列化一个对象到文件时， 按照Java的标准约定是给文件一个.ser扩展名。
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
	      反序列化对象
	          下面的DeserializeDemo程序实例了反序列化，/tmp/employee.ser存储了Employee对象。
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

