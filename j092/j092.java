/*(1) Monkey�����и����췽����Monkey (String s)�������и�public void speak()��������speak���������������ѽѽ......������Ϣ��
(2)People����Monkey������࣬��People������д����speak(),��speak�����������С���ģ��������˵���ˣ�������Ϣ��
(3)��People������������void think()����think�������������˵��������˼����������Ϣ��
(4)������E��main�����д���Monkey��People��Ķ����������2����Ĺ��ܡ�*/
class Monkey{
	Monkey(String s){
		
	}
    
    public void speak()
    {
        System.out.println("����ѽѽ......");
    }
}

class People extends Monkey{

    People(String s) {
        super(s);
    }
    
    public void speak()
    {
        System.out.println("С���ģ��������˵���ˣ�");
    }
    public void think()
    {
        System.out.println("��˵��������˼����");
    }
}

public class j092 {
	public static void main(String[] args) {
        Monkey m = new Monkey("tom");
        m.speak();
        People p = new People("Xiaoming");
        p.speak();
        p.think();
    }
}
