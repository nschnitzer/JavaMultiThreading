package MultiThread;

public class Question implements Runnable 
{
	Talk t;
	String[] s1 = {"Hi", "How are you?", "I am also doing fine"};
	
	public Question(Talk t1)
	{
		t = t1;
		new Thread(this, "Question").start();
	}
	
	public void run()
	{
		for (int i = 0; i < s1.length; i++)
		{
			t.Question(s1[i]);
		}
	}

}
