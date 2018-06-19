//用接口的方法获取类名
/*定义一个ClassName接口，接口中只有一个抽象方法getClassName()。
 * 设计一个类Company，该类实现接口ClassName中的方法getClassName()，
 * 功能是获取该类的类名称。编写应用程序使用Company类。*/
public class j090 implements ClassName{
	public String getClassName() {
		return "Company";
	}
}
