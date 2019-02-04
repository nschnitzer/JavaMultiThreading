//****************************************************************
// Nathan Schnitzer
// MyThread.java
// 1/29/19
// Contains a custom thread
//****************************************************************

package threadsBasic;

public class MyThread extends Thread
{
	String name;
	
	//Default Constructor
	public MyThread()
	{
		super();
	}

	//Constructor w/ Runnable parameter
	public MyThread(Runnable target)
	{
		super(target);
	}

	//Constructor w/ Runnable and String parameter
	public MyThread(Runnable target, String name)
	{
		super(target, name);

	}

	//Constructor w/ String parameter
	public MyThread(String name)
	{
		super(name);

	}


}
