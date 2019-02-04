//*********************************************
// Nathan Schnitzer
// ConversationDriver.java
// 2/4/19
// Haves a conversation using synchronization and multithreading
//*********************************************

package MultiThread;

public class ConversationDriver 
{

	public static void main(String[] args) 
	{
		Talk t = new Talk();
		new Question(t);
		new Answer(t);

	}

}
