import java.io.File;
 
/**
 * 以树状结构输出计算机某个指定文件夹下的所有的文件和子文件夹名称
 *
 */
public class j181 {
	public static void main(String[] args) {
		j181 t = new j181(); // new一个对象
		File f = new File("D:/MyFiles");// new一个文件对象，路径自定义但要注意斜杠
		t.bl(f, 0);// 调用方法
	}
 
	public void bl(File f, int lever) {
		// 判断是否存在
		if (f.exists()) {
			// 判断是否是第一级目录
			if (lever == 0) {
				System.out.println(f.getName());// 一级目录只打名称
			} else {
				// 循环打空格
				for (int i = 0; i < lever; i++) {
					System.out.print(" ");
				}
				System.out.println("├" + f.getName()); // 二级目录打标识符├
			}
			// 判断是不是目录
			if (f.isDirectory()) {
				// 列出所有文件及文件夹
				File[] fs = f.listFiles();
				// 判断fs是否为空
				if (null != fs) {
					// 循环递归
					for (File s : fs) {
						bl(s, lever + 1);
					}
				}
			}
		}
	}
}
