import java.io.*;
 
public class j182 {
	// 删除某个目录及目录下的所有子目录和文件
	public static boolean deleteDir(File dir) {
		// 如果是文件夹
		if (dir.isDirectory()) {
			// 则读出该文件夹下的的所有文件
			String[] children = dir.list();
			// 递归删除目录中的子目录下
			for (int i = 0; i < children.length; i++) {
				// File f=new File（String parent ，String child）
				// parent抽象路径名用于表示目录，child 路径名字符串用于表示目录或文件。
				// 连起来刚好是文件路径
				boolean isDelete = deleteDir(new File(dir, children[i]));
				// 如果删完了，没东西删，isDelete==false的时候，则跳出此时递归
				if (!isDelete) {
					return false;
				}
			}
		}
		// 读到的是一个文件或者是一个空目录，则可以直接删除
		return dir.delete();
	}
 
	// 复制某个目录及目录下的所有子目录和文件到新文件夹
	public static void copyFolder(String oldPath, String newPath) {
		try {
			// 如果文件夹不存在，则建立新文件夹
			(new File(newPath)).mkdirs();
			// 读取整个文件夹的内容到file字符串数组，下面设置一个游标i，不停地向下移开始读这个数组
			File filelist = new File(oldPath);
			String[] file = filelist.list();
			// 要注意，这个temp仅仅是一个临时文件指针
			// 整个程序并没有创建临时文件
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				// 如果oldPath以路径分隔符/或者\结尾，那么则oldPath/文件名就可以了
				// 否则要自己oldPath后面补个路径分隔符再加文件名
				// 谁知道你传递过来的参数是f:/a还是f:/a/啊？
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}
 
				// 如果游标遇到文件
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					// 复制并且改名
					FileOutputStream output = new FileOutputStream(newPath
							+ "/" + "rename_" + (temp.getName()).toString());
					byte[] bufferarray = new byte[1024 * 64];
					int prereadlength;
					while ((prereadlength = input.read(bufferarray)) != -1) {
						output.write(bufferarray, 0, prereadlength);
					}
					output.flush();
					output.close();
					input.close();
				}
				// 如果游标遇到文件夹
				if (temp.isDirectory()) {
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("复制整个文件夹内容操作出错");
		}
	}
 
	public static void moveFolder(String oldPath, String newPath) {
		// 先复制文件
		copyFolder(oldPath, newPath);
		// 则删除源文件，以免复制的时候错乱
		deleteDir(new File(oldPath));
	}
 
	public static void main(String[] args) {
		moveFolder("c:/A", "f:/B");
	}
 
}
