package multilevel_inheritance;
class one
{
	void disp1()
	{
		System.out.println("one");
	}
}
class two extends one
{
	void disp2()
	{
		System.out.println("two");
	}
}
class three extends two
{
	void disp3()
	{
		System.out.println("three");
	}
}
class four extends three
{
	void disp4()
	{
		System.out.println("four");
	}
}
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		four ob1=new four();
		ob1.disp1();
		ob1.disp2();
		ob1.disp3();
		ob1.disp4();
		

	}

}
