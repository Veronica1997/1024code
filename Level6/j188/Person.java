import java.io.Serializable;

public class Person implements Serializable {  

    private String name = null;  
    private Integer age = null;   

    public Person(){
        System.out.println("无参构造");
    }
    public Person(String name, Integer age) {  
        this.name = name;  
        this.age = age;  
    }  
    
    @Override 
    public String toString() {  
        return "[" + name + ", " + age+"]";  
    }  
} 
