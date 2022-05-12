package thread_priority;

public class threadpriority extends Thread
{
	public void run()
	{
		System.out.println("Thread"+Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadpriority t1=new threadpriority();
		threadpriority t2=new threadpriority();
		threadpriority t3=new threadpriority();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("priority of thread"+ " "+t1.getName()+" "+t1.getPriority());
		System.out.println("priority of thread"+ " "+t2.getName()+" "+t2.getPriority());
		System.out.println("priority of thread"+ " "+t3.getName()+" "+t3.getPriority());
		

	}

}
