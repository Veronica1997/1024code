import java.io.File;

public class j169 {
	public static void main(String[] args) {
		File file = new File("d://note.txt");
		print(file);
	}

	private static void print(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] arr = f.listFiles();
				if (arr != null) {
					for (File file : arr) {
						print(file);
					}
				}
			} else {
				System.out.println(f.getAbsolutePath() + "\t´óÐ¡:" + f.length() + "×Ö½Ú");
			}
		}

	}
}
