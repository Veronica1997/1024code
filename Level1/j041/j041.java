import java.util.Scanner;

public class j041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n= input.nextInt();
	    double i =(double)n;
	    System.out.println("�����ۼ����ѽ��Ϊ��"+i);
	    int grade = (int)(i/200);
	    StringBuilder str = new StringBuilder("��������");
	    StringBuilder rebate = new StringBuilder();
	    switch(grade) {
	    	case 1:rebate.append("����");break;
	    	case 2:rebate.append("��");break;
	    	case 3:rebate.append("����");break;
	    	case 4:rebate.append("����");break;
	    	case 5:rebate.append("����");break;
	    	case 6:rebate.append("��");break;
	    	case 7:rebate.append("�߰�");break;
	    	case 8:rebate.append("����");break;
	    	case 9:rebate.append("����");break;
	    	case 10:rebate.append("��");break;
	    	case 11:rebate.append("����");break;
	    	case 12:rebate.append("��");break;
	    }
	    str.append(rebate);
	    str.append("���Żݣ�");
	    System.out.println(str.toString());
	}
}
