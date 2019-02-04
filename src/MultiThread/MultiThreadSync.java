package MultiThread;

public class MultiThreadSync extends Thread
{
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	//default constructor
	public MultiThreadSync()
	{
		
	}
	
	//Constructs with a String parameter that will be the name of the thread
	public MultiThreadSync(String name, PrintDemo demo)
	{
		threadName = name;
		System.out.println("Creating " + threadName);
		pd = demo;
	}
	
	//Synchronized
	public void run()
	{
		synchronized(pd)
		{
			pd.printCount();
		}
		System.out.println("Exiting thread: " + threadName);
	}
	
	public void start()
	{
		System.out.println("Starting " + threadName);
		if (t == null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
}


