import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class j167 {
	public static void main(String[] args) throws Exception {
		File file = new File("d://note.txt");
		FileOutputStream out = new FileOutputStream(file, true);
		FileChannel fout = out.getChannel();

		FileLock lock = fout.lock();// ��ռ��
		if (lock != null) {
			System.out.println("�ļ���������");
			Thread.sleep(20000);
			lock.release();
			System.out.println("�ļ����ͷ���");
		}
		fout.close();
		out.close();

	}
}
