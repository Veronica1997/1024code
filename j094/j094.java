/*���췽�������� ����һ�������� ������̥���� ������ɫ �������������ԡ�
 * ��ͨ����ͬ�Ĺ��췽������ʵ���� 
 * ����Ҫ�� �����ܹ����� ���� ͣ���� Ҫ�� �����淶 �������ֲ�� ���ѺõĲ�����ʾ��*/
class Auto {
	public int num;
	public String color;
	public double weight;
	public double speed;

	Auto() {
//�޲ι���
	}

	Auto(int num, String color, double weight, double speed) {//�вι���
		this.num = num;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}

	public void speedUp() {
		System.out.println("Auto����");
	}

	public void speedDown() {
		System.out.println("Auto����");
	}

	public void Stop() {
		System.out.println("Autoͣ��");
	}
}


public class j094 {

}
