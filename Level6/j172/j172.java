import java.io.File;

public class j172 {
	public static void main(String[] args) {
		File file = new File("d:test");
        File[] files = file.listFiles();
        for(int i=0; i<files.length; i++){
            File tmp = files[i];
            if(tmp.toString().endsWith(".txt")){
                tmp.delete();
            }
        }
	}
}
