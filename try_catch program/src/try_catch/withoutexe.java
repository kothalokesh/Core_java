package try_catch;

public class withoutexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,c;
		try
		{
		 c=55/a;
		}
		catch(ArithmeticException e)
		{
		System.out.println("divisible by zero");
		}
		System.out.println("will not print");			

	}

}
