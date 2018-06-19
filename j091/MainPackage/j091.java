package MainPackage;

/*继承 创建一个名称为MainPackage的包 使它包含MainClass和MainSubClass类。
 * MainClass类应当包含变量声明 其值从构造函数中输出。
 * MainSubClass类从MainClass派生而来*/
public class j091 {
	public int a;
	public int b;

	public j091() {
		System.out.println(a + " " + b);
	}
}
class subMainClass extends j091 {
    public subMainClass() {
        super();
    }
}
