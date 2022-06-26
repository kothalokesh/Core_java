package interfacemultipleinheritance;
interface Multiple
{
	void view();
	int x=10;
}
interface Inherit
{
	void show();
	
}

public class InMp implements Multiple,Inherit
{
	public void view()
	{
	System.out.println("welcome");
}
public void show()
{
	System.out.println("to");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InMp ob=new InMp();
		ob.view();
		ob.show();

	}

}
