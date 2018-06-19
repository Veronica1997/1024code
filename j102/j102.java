/*定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。
 * 在建立类的实例时 把以上三个信息都作为构造函数的参数输入 其中用户ID和用户密码时是必须的 ,缺省的email地址是用户ID加上字符串"@gameschool.com"*/
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
