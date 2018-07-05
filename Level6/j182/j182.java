import java.io.*;
 
public class j182 {
	// ɾ��ĳ��Ŀ¼��Ŀ¼�µ�������Ŀ¼���ļ�
	public static boolean deleteDir(File dir) {
		// ������ļ���
		if (dir.isDirectory()) {
			// ��������ļ����µĵ������ļ�
			String[] children = dir.list();
			// �ݹ�ɾ��Ŀ¼�е���Ŀ¼��
			for (int i = 0; i < children.length; i++) {
				// File f=new File��String parent ��String child��
				// parent����·�������ڱ�ʾĿ¼��child ·�����ַ������ڱ�ʾĿ¼���ļ���
				// �������պ����ļ�·��
				boolean isDelete = deleteDir(new File(dir, children[i]));
				// ���ɾ���ˣ�û����ɾ��isDelete==false��ʱ����������ʱ�ݹ�
				if (!isDelete) {
					return false;
				}
			}
		}
		// ��������һ���ļ�������һ����Ŀ¼�������ֱ��ɾ��
		return dir.delete();
	}
 
	// ����ĳ��Ŀ¼��Ŀ¼�µ�������Ŀ¼���ļ������ļ���
	public static void copyFolder(String oldPath, String newPath) {
		try {
			// ����ļ��в����ڣ��������ļ���
			(new File(newPath)).mkdirs();
			// ��ȡ�����ļ��е����ݵ�file�ַ������飬��������һ���α�i����ͣ�������ƿ�ʼ���������
			File filelist = new File(oldPath);
			String[] file = filelist.list();
			// Ҫע�⣬���temp������һ����ʱ�ļ�ָ��
			// ��������û�д�����ʱ�ļ�
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				// ���oldPath��·���ָ���/����\��β����ô��oldPath/�ļ����Ϳ�����
				// ����Ҫ�Լ�oldPath���油��·���ָ����ټ��ļ���
				// ˭֪���㴫�ݹ����Ĳ�����f:/a����f:/a/����
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}
 
				// ����α������ļ�
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					// ���Ʋ��Ҹ���
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
				// ����α������ļ���
				if (temp.isDirectory()) {
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("���������ļ������ݲ�������");
		}
	}
 
	public static void moveFolder(String oldPath, String newPath) {
		// �ȸ����ļ�
		copyFolder(oldPath, newPath);
		// ��ɾ��Դ�ļ������⸴�Ƶ�ʱ�����
		deleteDir(new File(oldPath));
	}
 
	public static void main(String[] args) {
		moveFolder("c:/A", "f:/B");
	}
 
}
