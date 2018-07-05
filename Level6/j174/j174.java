import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class j174 {

	public static void main(String params[]) throws Exception {
		String[] iF = new String[] { "E:/test1.txt", "E:/test2.txt", "E:/test3.txt", "E:/test4.txt" };
		String oF = "E:/out.txt";

		FileOutputStream output = new FileOutputStream(new File(oF));
		WritableByteChannel targetChannel = output.getChannel();

		for (int i = 0; i < iF.length; i++) {
			FileInputStream input = new FileInputStream(iF[i]);
			FileChannel inputChannel = input.getChannel();

			inputChannel.transferTo(0, inputChannel.size(), targetChannel);

			inputChannel.close();
			input.close();
		}
		targetChannel.close();
		output.close();
		System.out.println("All jobs done...");

	}

}
