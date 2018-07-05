import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class j167 {
	public static void main(String[] args) throws Exception {
		File file = new File("d://note.txt");
		FileOutputStream out = new FileOutputStream(file, true);
		FileChannel fout = out.getChannel();

		FileLock lock = fout.lock();// 独占锁
		if (lock != null) {
			System.out.println("文件被锁定了");
			Thread.sleep(20000);
			lock.release();
			System.out.println("文件被释放了");
		}
		fout.close();
		out.close();

	}
}
