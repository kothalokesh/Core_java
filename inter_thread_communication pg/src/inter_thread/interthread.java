package inter_thread;

public class interthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interthreadA b=new interthreadA();
		b.start();
		synchronized(b)
		{
			try {
				System.out.println("waiting for b complete");
				b.wait();
				
			}
			catch(InterruptedException e)
			{
			   e.printStackTrace();
			}
			System.out.println("Total is:"+b.total);
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
