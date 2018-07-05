import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class j188 {
	public static void main(String[] args) throws Exception {  
        File file = new File("person.txt");  

        //序列化持久化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));  
        Person person = new Person("Peter", 27);  
        out.writeObject(person);  
        out.close();  

        //反序列化，并得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));  
        Object newPerson = in.readObject(); // 没有强制转换到Person类型  
        in.close();  
        System.out.println(newPerson);  
    }  
}
