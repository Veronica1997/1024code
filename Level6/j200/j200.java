import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class j200{
      public static void main(String[] args) throws IOException {
  //���췽��      ��ʽһ������һ����ָ�������ʾ���ļ���д�����ݵ��ļ���
          FileOutputStream file=
                  new FileOutputStream(new File("fos.txt"),true);    
  //��ʽ��������һ����ָ�������ļ���д�����ݵ��ļ�����
  
  //        FileOutputStream file=
  //                new FileOutputStream("fos.txt",true);
         file.write("hello".getBytes());
         file.close();
     }    
 }