import java.io.File;

public class j173 {
	public static void main(String[] args) {
		File file = new File("d:test");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			File tmp = files[i];
			tmp.delete();
		}
	}
}
