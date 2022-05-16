package synchronised_keywordpg;
class counter
{
	int count;
	public synchronized void inc()
	{
	 count++;
	}
}

public class syncdemo {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		counter ob=new counter();
		
		
		
		Thread t1=new Thread(new Runnable()
          {
			
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
			 ob.inc();
			}
				System.out.println("count is"+ob.count);
			}
				});
		
		
		
	Thread t2=new Thread(new Runnable()
				{
			public void run()
			{
				for(int i=0;i<2000;i++)
				{
					ob.inc();
				}
				System.out.println("count is"+ob.count);
			}
				});
t1.start();
t2.start();
t1.join();
t2.join();
	}

}
