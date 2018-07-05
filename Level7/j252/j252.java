import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class j252 {
	public static void main(String[] args) throws Exception {
		  String birthday ="2000-02-29";
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		  Calendar cal = Calendar.getInstance();
		  int yearNow = cal.get(Calendar.YEAR);// 年
		  cal.setTime(formatter.parse(birthday));
		  int birthyear=cal.get(Calendar.YEAR);
		  while(birthyear<yearNow){
		   cal.set(Calendar.YEAR,cal.get(Calendar.YEAR)+1);
		   birthyear=cal.get(Calendar.YEAR);
		  }
		  Date ed=new Date();
		  Date sd=cal.getTime();
		  long days=0;
		  if((ed.getTime() - sd.getTime()) / (3600 * 24 * 1000)> 0 ){
		   days=(ed.getTime() - sd.getTime()) / (3600 * 24 * 1000);
		   System.out.println("距离你生日还有" + days + "天");
		  }else{
		   cal.set(Calendar.YEAR,cal.get(Calendar.YEAR)+1);
		   sd=cal.getTime();
		   days=(ed.getTime() - sd.getTime()) / (3600 * 24 * 1000);
		   System.out.println("距离你生日还有" + days + "天");
		  }
		 }
}
