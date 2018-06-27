//书写一个类继承Exception，在另一个类中书写一个方法抛出这个异常对象。
import java.util.*;
public class j135 {
    private static final int STRING_LENGTH = 10;
 
    public static void main(String[] args) {
        String s;
        try {
            s = getString();
        } catch (StringLengthTooLargeException e) {
            e.printStackTrace();
            s = "error";
        }
        System.out.println(s);
    }
 
    private static String getString() throws StringLengthTooLargeException {
        String s = new Scanner(System.in).next();
        if (s.length() > STRING_LENGTH) {
            throw new StringLengthTooLargeException();
        }
        return s;
    }
}
 
class StringLengthTooLargeException extends Exception {
    public StringLengthTooLargeException() {
        super("字符串长度超过设定长度");
    }
}
