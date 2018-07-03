// 使用泛型实现栈结构，创建不同泛型的栈对象，实现入栈出栈操作
public class j146 {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("视频学Java");  //向栈中增加字符串
        stack.push("细说Java");   //向栈中增加字符串
        stack.push("Java从入门到精通(第2版)"); //向栈中增加字符串
        System.out.println("从栈中取出字符串：");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());//删除栈中全部元素并进行输出
        }
    }
}
