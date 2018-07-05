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
 * 1、实现一个文件分割器，把一个大文件分割成若干个小文件（可根据情况自行设计），
 * 分割后的文件扩展名为dat，文件名为：原文件名+原扩展名+编号+.dat
 * 2、把分割后的文件再合并（文件还原）成完整文件，与源文件一致。
 * @author lym
 *
 */
public class j175 {
 
	/**
	 * 文件分割
	 * @param src 源文件路径
	 * @param fileSize 分割后每个文件的大小，单位是MB
	 * @param dest 目标文件路径
	 */
	public static void split(String src,int fileSize,String dest){
		
		if("".equals(src)||src==null||fileSize==0||"".equals(dest)||dest==null){
			System.out.println("分割失败");
		}
		
		File srcFile = new File(src);//源文件
		
		long srcSize = srcFile.length();//源文件的大小
		long destSize = 1024*1024*fileSize;//目标文件的大小（分割后每个文件的大小）
		
		int number = (int)(srcSize/destSize);
		number = srcSize%destSize==0?number:number+1;//分割后文件的数目
		
		String fileName = src.substring(src.lastIndexOf("\\"));//源文件名
		
		InputStream in = null;//输入字节流
		BufferedInputStream bis = null;//输入缓冲流
		byte[] bytes = new byte[1024*1024];//每次读取文件的大小为1MB
		int len = -1;//每次读取的长度值
		try {
			in = new FileInputStream(srcFile);
			bis = new BufferedInputStream(in);
			for(int i=0;i<number;i++){
				
				String destName = dest+File.separator+fileName+"-"+i+".dat";
				OutputStream out = new FileOutputStream(destName);
				BufferedOutputStream bos = new BufferedOutputStream(out);
				int count = 0;
				while((len = bis.read(bytes))!=-1){
					bos.write(bytes, 0, len);//把字节数据写入目标文件中
					count+=len;
					if(count>=destSize){
						break;
					}
				}
				bos.flush();//刷新
				bos.close();
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭流
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
		 * 分割测试
		 */
		String src = "E:\\API\\JDK_API_1_6_zh_CN.CHM";//要分割的大文件
		int fileSize = 10;
		String dest = "D:\\";//文件分割后保存的路径
		System.out.println("分割开始。。。");
		split(src, fileSize, dest);
		System.out.println("分割完成");
	}
}
