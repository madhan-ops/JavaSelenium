package javatraining;

public class ThreadSynchronization
{
	public static void main(String[] args)
	{
	//	Printer pr=new Printer();
		

	}

}
class Printer
{
	public void printing(int n,String s)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("printing for"+s+"with number"+i);
		}
	}
}
class Malli extends Printer implements Runnable
{
	Printer poc;
	Malli(Printer p)
	{
		poc=p;
	}
	public void run()
	{
		poc.printing(10,"Rahul");
	}
}