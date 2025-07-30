package MultiThread;

public class MyThreadMain
{
	public static void main(String[] args) {
		//New Bron Start
		MyThread myThread=new MyThread();
		myThread.setName("MyThred -1");
		
		//Ready to run //Runnable start
		myThread.start();//Thread class method : start()
		
		
		MyThread myThread2=new MyThread("MyThread-2");
		myThread2.start();
		
		
		//myThread.start();//IllegalThreadStateException
		Thread thread=Thread.currentThread();//To get currently running Thread Object
		
		for(int i =1;i<50;i++)
		{
			System.out.println(thread.getName()+ " : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			myThread.join();
			myThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("End of the Application ");
	
	}
}
