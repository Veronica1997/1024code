import java.io.FileOutputStream;
import java.io.IOException;
 
/**
	�����롿����Fibonacii���У�a1=1,a2=1...an=an-1+an-2 ��ǰ��������1,��3������ʼ��
	ÿ������ǰ�������ĺͣ��������е�ǰ20����ã�Ҫ��ÿ5��1�С�
	
 */
//1.�ֽ�����ʽ
public class j199 {
	
	private static int fun(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fun(n-1)+fun(n-2);
		}
	}
	
	public static void main(String[] args) {
		//�ֽ��ļ����ķ�ʽ�����һ���ļ�
		try {
			
			FileOutputStream out=new FileOutputStream("Fibonacii.txt");
			
			for (int i =1; i<=20; i++) {
				//����ת�ַ���
				String str=Integer.toString(fun(i));
				
				out.write(str.getBytes());
				out.write("\t".getBytes());
				
				if(i%5==0) {
					out.write("\r\n".getBytes());
				}
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
