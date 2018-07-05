import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
 
public class j209  {
	public static void main(String[] args){
		File src = new File("E:\\JavaIO\\abc.txt");
		File des = new File("E:\\JavaIO\\abc1.txt");
			
	    try {
			IOUitl.copyfile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}