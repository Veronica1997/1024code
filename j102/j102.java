/*����һ�������û��� Ҫ�������Ϣ���û�ID���û����롢email��ַ��
 * �ڽ������ʵ��ʱ ������������Ϣ����Ϊ���캯���Ĳ������� �����û�ID���û�����ʱ�Ǳ���� ,ȱʡ��email��ַ���û�ID�����ַ���"@gameschool.com"*/
class User {
	private String id, email, password;

	public User(String id, String password, String email) {
		this.password = password;
		this.id = id;
		this.email = email + "@gameschool.com";
	}

	void show() {
		System.out.println("id:" + id + "/password:" + password + "/email:" + email);
	}

}

public class j102 {

	public static void main(String[] args) {
		User s1 = new User("0001", "1234561234516", "guang");
		User s2 = new User("0002", "123456", "zhang");
		User s3 = new User("0003", "123456", "li");
		s1.show();
		s2.show();
		s3.show();
	}

}
