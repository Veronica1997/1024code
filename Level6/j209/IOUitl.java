import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class IOUitl {
	public static void copyfile(File src,File des)throws IOException{
		if(!src.exists()){
			throw new IllegalArgumentException(src+"原文件不存在");
		}
		if(!src.isFile()){
			throw new IllegalArgumentException(src+"不是文件");
		}
		FileInputStream in = new FileInputStream(src);
		//文件不存在直接创建，文件存在删除后创建
		FileOutputStream out = new FileOutputStream(des);
		byte[] buf = new byte[8*1024];
		int b;
		//in.read(buf,0,buf.length)将读的数据存在buf数组，从0开始到数组长度
		while((b=in.read(buf,0,buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush();
		}
		in.close();
	}
}