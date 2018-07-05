import java.io.FileOutputStream;
import java.io.IOException;
 
/**
	【编码】计算Fibonacii数列，a1=1,a2=1...an=an-1+an-2 即前两个数是1,从3个数开始，
	每个数是前两个数的和，计算数列的前20项，并用，要求每5项1行。
	
 */
//1.字节流方式
public class j199 {
	
	private static int fun(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fun(n-1)+fun(n-2);
		}
	}
	
	public static void main(String[] args) {
		//字节文件流的方式输出到一个文件
		try {
			
			FileOutputStream out=new FileOutputStream("Fibonacii.txt");
			
			for (int i =1; i<=20; i++) {
				//整形转字符串
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
