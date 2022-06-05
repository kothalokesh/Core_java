package parameterized_constructor;

public class Example
{
Example()
{
	System.out.println("this is a default constructor");
}
Example(int a,int b)
{
	System.out.println("constructor with two parameterised");
}
Example(int c,int d,int e)
{
	System.out.println("constructor with three parameters");
}
Example(int i,String name)
{
	System.out.println("constructor with int and string parameter");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ob1=new Example();
		Example ob2=new Example(1,2);
		Example ob3=new Example(1,2,3);
		Example ob4=new Example(5,"Lokesh");
		

	}

}
