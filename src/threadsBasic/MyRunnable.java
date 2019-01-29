//****************************************
// Nathan Schnitzer
// MyRunnable.java
// 1/29/19
// Creates a Runnable object for a thread
//****************************************

package threadsBasic;

public class MyRunnable implements Runnable
{
	//Default Constructor
	public MyRunnable()
	{
		
	}
	
	//Run Method
	public void run()
	{
		System.out.println("Runnable is running");
	}

}
