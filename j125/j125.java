//设置一个除数为0的除法，并用try catch包围。
public class j125 {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		try
		{
			x = x / y;
		} catch (Exception e)
		{
			System.out.println("除数不能为空,具体错误信息如下所示\n");
		}
	}
}
