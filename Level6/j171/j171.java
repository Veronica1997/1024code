import java.io.File;

public class j171 {

	public static void main(String[] args) {
		String path = "E:/test"; 
		File file = new File(path);
		boolean isDirectory = file.isDirectory();
		if (!isDirectory) { 
			System.out.println(path + "�����ļ��У�");
			return;
		}
		String[] files = file.list();
		File f = null;
		String newFileName = ""; // �µ��ļ�����
		String oldFileName = ""; // �ɵ��ļ�����
		for (int i = 0; i < files.length; i++) { // �������ļ����µ������ļ�
			oldFileName = files[i];
			// ����������ض���ʽ��ͷ���ļ���������
			if (!oldFileName.contains("[Ѹ������www.2tu.cc]"))
				continue;

			newFileName = "���鹫Ԣ�ڶ���";
			newFileName += oldFileName.substring(oldFileName.indexOf("P") + 3, oldFileName.length());

			// ���޸ĺ���ļ�������ԭĿ¼��
			f = new File(path + "/" + oldFileName);
			f.renameTo(new File(path + "/" + newFileName));
		}
	}

}
