
//�û������ķ�ʽʵ���ļ����ƶ�
import java.io.*;

public class j208 {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("pw.txt");
			FileOutputStream fos = new FileOutputStream("pwcopy2.txt");

			BufferedInputStream bis = new BufferedInputStream(fis);// ����������
			BufferedOutputStream bos = new BufferedOutputStream(fos);// ���������

			int ch = -1;
			while ((ch = bis.read()) != -1) {
				bos.write(ch);
			}
			bis.close();
			bos.close();
			System.out.println("over");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}