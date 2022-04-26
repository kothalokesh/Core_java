package hierarchical_program;
class A
{
	void disp1()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void disp2()
	{
		System.out.println("B");
	
	}
}
class C extends A
{
	void disp3()
	{
		System.out.println("C");
	
	}
}
class D extends A
{
	void disp4()
	{
		System.out.println("D");
	}
}
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();
		ob1.disp1();
		ob1.disp2();
		
		C ob2=new C();
		ob2.disp1();
		ob2.disp3();
		
		D ob3=new D();
		ob3.disp1();
		ob3.disp4();
		
		

	}

}
