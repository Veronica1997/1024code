import java.util.Scanner;

public class j041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n= input.nextInt();
	    double i =(double)n;
	    System.out.println("您的累计消费金额为："+i);
	    int grade = (int)(i/200);
	    StringBuilder str = new StringBuilder("您将享受");
	    StringBuilder rebate = new StringBuilder();
	    switch(grade) {
	    	case 1:rebate.append("九五");break;
	    	case 2:rebate.append("九");break;
	    	case 3:rebate.append("八五");break;
	    	case 4:rebate.append("八三");break;
	    	case 5:rebate.append("九五");break;
	    	case 6:rebate.append("八");break;
	    	case 7:rebate.append("七八");break;
	    	case 8:rebate.append("七五");break;
	    	case 9:rebate.append("七三");break;
	    	case 10:rebate.append("七");break;
	    	case 11:rebate.append("六五");break;
	    	case 12:rebate.append("六");break;
	    }
	    str.append(rebate);
	    str.append("折优惠！");
	    System.out.println(str.toString());
	}
}
