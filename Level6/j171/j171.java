import java.io.File;

public class j171 {

	public static void main(String[] args) {
		String path = "E:/test"; 
		File file = new File(path);
		boolean isDirectory = file.isDirectory();
		if (!isDirectory) { 
			System.out.println(path + "不是文件夹！");
			return;
		}
		String[] files = file.list();
		File f = null;
		String newFileName = ""; // 新的文件名字
		String oldFileName = ""; // 旧的文件名字
		for (int i = 0; i < files.length; i++) { // 遍历该文件夹下的所有文件
			oldFileName = files[i];
			// 如果不是以特定形式开头的文件，跳过它
			if (!oldFileName.contains("[迅雷下载www.2tu.cc]"))
				continue;

			newFileName = "爱情公寓第二季";
			newFileName += oldFileName.substring(oldFileName.indexOf("P") + 3, oldFileName.length());

			// 将修改后的文件保存在原目录下
			f = new File(path + "/" + oldFileName);
			f.renameTo(new File(path + "/" + newFileName));
		}
	}

}
