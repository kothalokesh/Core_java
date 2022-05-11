package multithreading_extended;
class eclipse extends Thread
{
public void run()
{
	System.out.println("hii");
}
}
class chrome extends Thread
{
public void run()
{
	System.out.println("hello");	
}
 }
 class notebook extends Thread
 {
public void run()
 {
	System.out.println("bye");	
}
 }
public class threadexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eclipse obj=new eclipse();
		obj.start();
		
		chrome ob1=new chrome();
		ob1.start();
		
		notebook ob2=new notebook();
		ob2.start();
		

	}

}
