import java.io.File;

public class j194 {
	public static void main(String[] args) {
		File file =new File("d:test");     
	      if (!file.exists() && !file.isDirectory()) {  
	          file.mkdirs();  
	      }  
	}
}
