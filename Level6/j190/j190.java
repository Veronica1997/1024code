import java.io.File;
import java.io.IOException;

public class j190 {
	public static void main(String[] args) {
		File file = new File("d:test");
		 File file2 = new File("D:/���ı��ĵ�.txt");
	        if(!file2.exists()){
	            try {
	                file2.createNewFile();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		if (file.exists() && file.isFile()) {
            String fileName = file.getName();
            System.out.println("�ļ�"+fileName+"�Ĵ�С�ǣ�"+file.length());
		}
	}
}
