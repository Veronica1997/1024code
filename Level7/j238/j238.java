import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class j238 {
	public static String DateToStr(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("1981-09-19 09:07:27");
		String str = format.format(date);
		return str;
	}

	public static Date StrToDate(String str) {

		SimpleDateFormat format = new SimpleDateFormat("1981-09-19 09:07:27");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(j238.StrToDate(j238.DateToStr(date)));
	}
}
