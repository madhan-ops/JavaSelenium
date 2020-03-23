package javatraining;

public class ThreadExTwo 
{

	public static void main(String[] args) throws Exception
	{
		Winner w=new Winner();
		w.start();
		
		System.out.println("Main Started");
		for(int i=0;i<10;i++)
		{
		System.out.println("Main Class Statement");
		}
		System.out.println("Main Ended");
		Thread.sleep(1000);
	}

}
class Winner extends Thread
{
	public void show() throws InterruptedException
	{
		System.out.println("Printing Started");
		for(int i=0;i<10;i++)
		{
		System.out.println("Printing Subclass");
		}
		System.out.println("Printing Ended");
		
		Thread.sleep(1000);
	}
	public void run()
	{
		try {
			show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}