package anonymous;

public class j116 {
	public static void main(String[] args) {  
		Person per = new Person() {  
            public Person say() {
                System.out.println("匿名say方法调用");
				return null;  
            }

			@Override
			public void eat() {
				System.out.println("eat");
			}  
		}.say();;
	}
}
