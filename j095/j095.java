//方法的重写和重载示例。
public class j095 {
	//重写
	class Parent {  
        public void say() {  
            System.out.println("Parent say()");  
        }  
    }  
  
    class Child extends Parent {  
        public void say() {  
            System.out.println("Child say()");  
        }  
    }  
    
    //重载
    public int add(int a, int b) {  
        return a + b;  
    }  
  
    public double add(double a, double b) {  
        return a + b;  
    }  
  
    public int add(int a) {  
        return a;  
    }  
  
    public int add(int a, double b) {  
        return 1;  
    }  
  
    public int add(double a, int b) {  
        return 1;  
    }  
}
