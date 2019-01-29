//*****************************************************************
// Nathan Schnitzer
// Driver.java
// 1/29/19
// Tests out threads and experiments
//*****************************************************************
package threadsBasic;

import java.lang.Thread;

public class Driver 
{

	public static void main(String[] args) 
	{
		Runnable runnable = () ->
		{
			System.out.println("Lambda Runnable is running");
		};
		
		MyThread newThread = new MyThread(runnable);
		newThread.start();
		newThread.run();

	}

}
