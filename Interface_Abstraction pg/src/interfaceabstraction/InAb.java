package interfaceabstraction;

interface Lok
{
	public void m1();
	public void m2();
	int x=10;
}

public class InAb implements Lok
{
	public void m1()
	{
		System.out.println("hello"+x);
	}
	public void m2()
	{
	System.out.println("world");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InAb ob=new InAb();
		ob.m1();
		ob.m2();
		

	}

	}

