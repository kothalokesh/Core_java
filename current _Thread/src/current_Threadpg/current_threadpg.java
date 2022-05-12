package current_Threadpg;
class eclipse extends Thread
{
	public void run()
	{
		System.out.print("eclipse id is"+Thread.currentThread().getId());
	}
}
class chrome extends Thread
{
	public void run()
	{
		System.out.println("chrome id is" + Thread.currentThread().getId());
	}
}
class notepad extends Thread
{
	public void run()
	{
		System.out.println("notepad id is"+Thread.currentThread().getId());
	}
}
public class current_threadpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main id"+Thread.currentThread().getId());
eclipse ob=new eclipse();
		ob.start();
chrome ob1=new chrome();
		ob1.start();
notepad ob2=new notepad();
ob2.start();
	}

}
