package j233;

import java.util.Date;

public class j233 {

    public static void main(String[] args) {
        /* ����1 ʹ��setTime��getTime��������ʱ����� */

        Date date = new Date();
        /*���ȣ�ʵ����Date��Ķ����ȡ��ǰ����-ʱ��*/

        System.out.println(date);
        //Sat Apr 30 15:54:48 GMT+08:00 2016

        //1�� ��ȡ1970��1��1����ʱ�൱ǰʱ�̵ĺ�������
        long time = date.getTime();
        System.out.println(time);    //1462002957770 
        /*Ȼ�󣬵���Date���getTime��������ȡ1970��1��1����ʱ�൱ǰʱ�̵ĺ�����*/

        //2�� ��ȡ�����ʱ�˿̵�����-ʱ�䡣
        //�ȼ���һ��ĺ�����
        long tommorowTime = 1000*60*60*24;

        //Ȼ������ڵĺ��������.
        time += tommorowTime;

        //��setTime����,���ø��ĺ�����ں�ʱ��
        date.setTime(time);
        //������ú��ʱ��
        System.out.println(date);
    }
}
