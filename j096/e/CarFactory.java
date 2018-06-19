package e;

public class CarFactory {  
    public static Car getCar(String name) {  
        if (name.equalsIgnoreCase("BMW")) {           
            return new BWM();  
        } 
        else {                                       
            return null;  
        }  
    }  
}  