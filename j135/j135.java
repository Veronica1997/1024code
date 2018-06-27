//��дһ����̳�Exception������һ��������дһ�������׳�����쳣����
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
        super("�ַ������ȳ����趨����");
    }
}
