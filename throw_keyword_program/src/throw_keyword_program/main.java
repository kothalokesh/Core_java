package throw_keyword_program;

public class main {
	static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("access denied-you must be at least18 years old");
		}
		else {
			System.out.println("access granted -you are old enough!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkage(15);

	}

}
