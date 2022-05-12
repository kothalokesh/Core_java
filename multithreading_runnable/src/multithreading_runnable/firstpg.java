package multithreading_runnable;

public class firstpg implements Runnable
{
	public void run()
	{
	System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstpg ob=new firstpg();
		Thread t1=new Thread(ob);
		t1.start();

	}

}
