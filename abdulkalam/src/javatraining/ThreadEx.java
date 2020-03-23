package javatraining;

public class ThreadEx {

	public static void main(String[] args) throws Exception
	{
		Aunt a=new Aunt();
		a.start();
		
		Uncle u=new Uncle();
		u.start();
		
		
	}

}
class Aunt extends Thread
{
	public void show() throws InterruptedException
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println("Hi:");
		Thread.sleep(1000);
	}	
	}
	@Override
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

class Uncle extends Thread
{
	public void show() throws InterruptedException 
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println("Hello:");
		Thread.sleep(1000);
	}	
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