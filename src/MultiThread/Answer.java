package MultiThread;

public class Answer implements Runnable
{
	Talk t;
	String[] t1 = {"Hi", "I am good, what about you?", "Great!"};
	
	public Answer(Talk t1)
	{
		t = t1;
		new Thread(this, "Answer").start();
	}
	
	public void run()
	{
		for (int i = 0; i < t1.length; i++)
		{
			t.Answer(t1[i]);
		}
	}

}
