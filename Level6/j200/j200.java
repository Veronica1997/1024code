import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class j200{
      public static void main(String[] args) throws IOException {
  //构造方法      方式一：创建一个向指定对象表示的文件中写出数据的文件流
          FileOutputStream file=
                  new FileOutputStream(new File("fos.txt"),true);    
  //方式二：创建一个向指定名称文件中写出数据的文件流，
  
  //        FileOutputStream file=
  //                new FileOutputStream("fos.txt",true);
         file.write("hello".getBytes());
         file.close();
     }    
 }