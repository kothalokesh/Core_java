package static_keyword;

public class hello {
	static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello l=new hello();
		hello o=new hello();
		
		l.age=20;
		o.age=50;
		System.out.println("age is"+l.age);
		System.out.println("age is"+o.age);

	}

}
