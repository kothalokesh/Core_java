package singleinheritance;
class lokesh
{
	void disp1()
	{
		System.out.println("lokesh");
	}
}

public class mani extends lokesh
{
	void disp2()
	{
		System.out.println("mani");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mani ob1=new mani();
		ob1.disp1();
		ob1.disp2();

	}

}
