//空指针异常
public class j127 {
    /**
     * 实现思路：
     * 1.空指针异常的表现之一：对空的字符串进行了操作
     * 2.设置一个空的字符串，然后对其进行查找操作（可以使用charAt()方法）
     * 3.对将要出现的异常进行捕获
     * 4.打印到控制台
     * */
    public static void main(String[] args) {
        String str = null;        
        try{
            System.out.println(str.charAt(0));
        }catch(Exception e){
            System.out.println("异常信息:");
            e.printStackTrace();           
        }
    }
}