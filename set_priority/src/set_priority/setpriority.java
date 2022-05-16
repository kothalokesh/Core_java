package set_priority;

public class setpriority extends Thread
{
	public void run()
	{
		System.out.println("THREAD"+ " " +Thread.currentThread().getName() + "started");
		System.out.println(" Thread SetPreority "+" " +Thread.currentThread().getPriority() + "running");
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setpriority t1=new setpriority();
		setpriority t2=new setpriority();
		setpriority t3=new setpriority();
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		

	}

}
