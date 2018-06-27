//找不到类异常
public class j128 {
	public static void main(String[] args) {  
        try {  
            System.out.println(ClassLoader.getSystemClassLoader());  
            System.out.println(ClassLoader.getSystemClassLoader().getParent());  
            System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
