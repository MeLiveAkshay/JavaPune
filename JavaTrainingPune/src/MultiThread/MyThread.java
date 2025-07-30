package MultiThread;

public class MyThread extends Thread
{
	//non-parameterized constructor
	public MyThread()
	{
		
	}
	
	//parameterized constructor
	public MyThread(String string)
	{
		super(string); 
	}

	public void run()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
