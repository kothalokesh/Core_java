package inter_thread;

public class interthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interthreadA a=new interthreadA();
		a.start();
		synchronized(a)
		{
			try {
				System.out.println("waiting for a complete");
				a.wait();
				
			}
			catch(InterruptedException e)
			{
			   e.printStackTrace();
			}
			System.out.println("Total is:"+a.total);
		}

	}

}
class interthreadA extends Thread
{
	int total;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<100;i++)
			{
				total+=i;
			}
			notify();
		}
	}
}
