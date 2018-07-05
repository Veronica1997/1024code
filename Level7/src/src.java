import java.util.*;

public class src {
	public static int getDays(int year, int month) {
		int days = 0;
		boolean isLeapYear = false;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {			
			isLeapYear = true;
		} else {			
			isLeapYear = false;
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			if (isLeapYear) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			System.out.println("error!!!");
			break;
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year=input.nextInt();
		System.out.println(year+" 年1月："+getDays(year,1)+"天");
		System.out.println(year+" 年2月："+getDays(year,2)+"天");
		System.out.println(year+" 年3月："+getDays(year,3)+"天");
		System.out.println(year+" 年4月："+getDays(year,4)+"天");
		System.out.println(year+" 年5月："+getDays(year,5)+"天");
		System.out.println(year+" 年6月："+getDays(year,6)+"天");
		System.out.println(year+" 年7月："+getDays(year,7)+"天");
		System.out.println(year+" 年8月："+getDays(year,8)+"天");
		System.out.println(year+" 年9月："+getDays(year,9)+"天");
		System.out.println(year+" 年10月："+getDays(year,10)+"天");
		System.out.println(year+" 年11月："+getDays(year,11)+"天");
		System.out.println(year+" 年12月："+getDays(year,12)+"天");
	}
}
