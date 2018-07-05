import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1��ʵ��һ���ļ��ָ�������һ�����ļ��ָ�����ɸ�С�ļ����ɸ������������ƣ���
 * �ָ����ļ���չ��Ϊdat���ļ���Ϊ��ԭ�ļ���+ԭ��չ��+���+.dat
 * 2���ѷָ����ļ��ٺϲ����ļ���ԭ���������ļ�����Դ�ļ�һ�¡�
 * @author lym
 *
 */
public class j175 {
 
	/**
	 * �ļ��ָ�
	 * @param src Դ�ļ�·��
	 * @param fileSize �ָ��ÿ���ļ��Ĵ�С����λ��MB
	 * @param dest Ŀ���ļ�·��
	 */
	public static void split(String src,int fileSize,String dest){
		
		if("".equals(src)||src==null||fileSize==0||"".equals(dest)||dest==null){
			System.out.println("�ָ�ʧ��");
		}
		
		File srcFile = new File(src);//Դ�ļ�
		
		long srcSize = srcFile.length();//Դ�ļ��Ĵ�С
		long destSize = 1024*1024*fileSize;//Ŀ���ļ��Ĵ�С���ָ��ÿ���ļ��Ĵ�С��
		
		int number = (int)(srcSize/destSize);
		number = srcSize%destSize==0?number:number+1;//�ָ���ļ�����Ŀ
		
		String fileName = src.substring(src.lastIndexOf("\\"));//Դ�ļ���
		
		InputStream in = null;//�����ֽ���
		BufferedInputStream bis = null;//���뻺����
		byte[] bytes = new byte[1024*1024];//ÿ�ζ�ȡ�ļ��Ĵ�СΪ1MB
		int len = -1;//ÿ�ζ�ȡ�ĳ���ֵ
		try {
			in = new FileInputStream(srcFile);
			bis = new BufferedInputStream(in);
			for(int i=0;i<number;i++){
				
				String destName = dest+File.separator+fileName+"-"+i+".dat";
				OutputStream out = new FileOutputStream(destName);
				BufferedOutputStream bos = new BufferedOutputStream(out);
				int count = 0;
				while((len = bis.read(bytes))!=-1){
					bos.write(bytes, 0, len);//���ֽ�����д��Ŀ���ļ���
					count+=len;
					if(count>=destSize){
						break;
					}
				}
				bos.flush();//ˢ��
				bos.close();
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//�ر���
			try {
				if(bis!=null)bis.close();
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		/**
		 * �ָ����
		 */
		String src = "E:\\API\\JDK_API_1_6_zh_CN.CHM";//Ҫ�ָ�Ĵ��ļ�
		int fileSize = 10;
		String dest = "D:\\";//�ļ��ָ�󱣴��·��
		System.out.println("�ָʼ������");
		split(src, fileSize, dest);
		System.out.println("�ָ����");
	}
}
