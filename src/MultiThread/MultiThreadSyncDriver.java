//****************************************
// Nathan Schnitzer
// MultiThreadDriver.java
// 2/4/19
// Tests out multithreading
//****************************************

package MultiThread;

public class MultiThreadSyncDriver {

	public static void main(String[] args) 
	{
		//RunnableTest t1 = new RunnableTest("Thread-1");
		//RunnableTest t2 = new RunnableTest("Thread-2");
		
		PrintDemo pd = new PrintDemo();
		
		MultiThreadSync t1 = new MultiThreadSync("Thread-1", pd);
		MultiThreadSync t2 = new MultiThreadSync("Thread-2", pd);
		MultiThreadSync t3 = new MultiThreadSync("Thread-3", pd);
		MultiThreadSync t4 = new MultiThreadSync("Thread-4", pd);
		
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();

	}

}

class PrintDemo {
	   public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}