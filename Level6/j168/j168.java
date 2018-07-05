import java.io.File;

public class j168 {
	public static void main(String[] args) {
		File file=new File("d://note.txt");
        if(file.exists()&&file.isFile())
            file.delete();
	}
}
