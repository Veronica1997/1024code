import java.io.File;
 
/**
 * ����״�ṹ��������ĳ��ָ���ļ����µ����е��ļ������ļ�������
 *
 */
public class j181 {
	public static void main(String[] args) {
		j181 t = new j181(); // newһ������
		File f = new File("D:/MyFiles");// newһ���ļ�����·���Զ��嵫Ҫע��б��
		t.bl(f, 0);// ���÷���
	}
 
	public void bl(File f, int lever) {
		// �ж��Ƿ����
		if (f.exists()) {
			// �ж��Ƿ��ǵ�һ��Ŀ¼
			if (lever == 0) {
				System.out.println(f.getName());// һ��Ŀ¼ֻ������
			} else {
				// ѭ����ո�
				for (int i = 0; i < lever; i++) {
					System.out.print(" ");
				}
				System.out.println("��" + f.getName()); // ����Ŀ¼���ʶ����
			}
			// �ж��ǲ���Ŀ¼
			if (f.isDirectory()) {
				// �г������ļ����ļ���
				File[] fs = f.listFiles();
				// �ж�fs�Ƿ�Ϊ��
				if (null != fs) {
					// ѭ���ݹ�
					for (File s : fs) {
						bl(s, lever + 1);
					}
				}
			}
		}
	}
}
