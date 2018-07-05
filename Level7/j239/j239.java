import java.lang.String.*;//这里调用java.long.String.contains()方法；
import java.util.Scanner;
public class j239 {
    public static void main(String[] args) {
        Scanner wsq = new Scanner(System.in);
        String str = wsq.next();
        boolean status = str.contains("abc");
        if(status){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}





