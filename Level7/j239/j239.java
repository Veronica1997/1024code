import java.lang.String.*;//�������java.long.String.contains()������
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





