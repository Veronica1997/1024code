import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class j188 {
	public static void main(String[] args) throws Exception {  
        File file = new File("person.txt");  

        //���л��־û�����
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));  
        Person person = new Person("Peter", 27);  
        out.writeObject(person);  
        out.close();  

        //�����л������õ�����
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));  
        Object newPerson = in.readObject(); // û��ǿ��ת����Person����  
        in.close();  
        System.out.println(newPerson);  
    }  
}
