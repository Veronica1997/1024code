package MainPackage;

/*�̳� ����һ������ΪMainPackage�İ� ʹ������MainClass��MainSubClass�ࡣ
 * MainClass��Ӧ�������������� ��ֵ�ӹ��캯���������
 * MainSubClass���MainClass��������*/
public class j091 {
	public int a;
	public int b;

	public j091() {
		System.out.println(a + " " + b);
	}
}
class subMainClass extends j091 {
    public subMainClass() {
        super();
    }
}
