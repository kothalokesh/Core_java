package multi_catch_program;

public class withoutexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=0;
			System.out.println("a="+a);
			int b=66/a;
			int c[]= {1};
			c[45]=99;
		}
catch(ArithmeticException e)
		{
	System.out.println("divisible by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("div by zero"+e);
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
	}

}
