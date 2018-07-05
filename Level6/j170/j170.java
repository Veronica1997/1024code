import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class j170 {

	public static String path = "D:\\a.txt";

	public static void main(String[] args) throws Exception {
		String aStr = "http";
		String bStr = "https";
		File file = new File(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		CharArrayWriter caw = new CharArrayWriter();
		String line = null;
		while ((line = br.readLine()) != null) {
			line = line.replaceAll(aStr, bStr);
			caw.write(line);
			caw.append(System.getProperty("line.separator"));
		}
		br.close();
		FileWriter fw = new FileWriter(file);
		caw.writeTo(fw);
		fw.close();
	}
}