package j233;

import java.util.Date;

public class j233 {

    public static void main(String[] args) {
        /* 案例1 使用setTime和getTime方法操作时间毫秒 */

        Date date = new Date();
        /*首先，实例化Date类的对象获取当前日期-时间*/

        System.out.println(date);
        //Sat Apr 30 15:54:48 GMT+08:00 2016

        //1） 获取1970年1月1日零时距当前时刻的毫秒数。
        long time = date.getTime();
        System.out.println(time);    //1462002957770 
        /*然后，调用Date类的getTime方法，获取1970年1月1日零时距当前时刻的毫秒数*/

        //2） 获取明天此时此刻的日期-时间。
        //先计算一天的毫秒数
        long tommorowTime = 1000*60*60*24;

        //然后和现在的毫秒数相加.
        time += tommorowTime;

        //用setTime方法,设置更改后的日期和时间
        date.setTime(time);
        //输出设置后的时间
        System.out.println(date);
    }
}
