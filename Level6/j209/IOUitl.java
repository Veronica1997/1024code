import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class IOUitl {
	public static void copyfile(File src,File des)throws IOException{
		if(!src.exists()){
			throw new IllegalArgumentException(src+"ԭ�ļ�������");
		}
		if(!src.isFile()){
			throw new IllegalArgumentException(src+"�����ļ�");
		}
		FileInputStream in = new FileInputStream(src);
		//�ļ�������ֱ�Ӵ������ļ�����ɾ���󴴽�
		FileOutputStream out = new FileOutputStream(des);
		byte[] buf = new byte[8*1024];
		int b;
		//in.read(buf,0,buf.length)���������ݴ���buf���飬��0��ʼ�����鳤��
		while((b=in.read(buf,0,buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush();
		}
		in.close();
	}
}