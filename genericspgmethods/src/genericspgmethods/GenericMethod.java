package genericspgmethods;

public class GenericMethod {
public <T> void methodgen(T var1) 
{
	System.out.println("the value passed is of type "+var1.getClass().getSimpleName());

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod ob= new GenericMethod();
		ob.<String>methodgen("hello");
		
		
		ob.methodgen("learning Java");
		ob.methodgen(154);

	}

}
