package javatraining;

public class ThreadRunnableImp {

	static public void main(String[] args)
	{
		
		Runnable r=new Dog();
		Thread th=new Thread(r);
		
		Thread th2=new Thread(new Elephant());
		th2.start();
		
		Thread th3=new Thread(new Horse());
		th3.start();
		th.start();
		for(int i=0;i<10;i++)
		System.out.println("First Sentence");
		
		for(int i=0;i<10;i++)
		{
		System.out.println("Thread in Main class");
		}	
	}

}

class Animal
{
	public void show()
	{
		System.out.println("I am Animal");
	}
}
class Dog extends Animal implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++) 
		{
		System.out.println("My name is Cat"+i);
		}
	}
	
}

class Elephant extends Dog implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++) 
		{
		System.out.println("My name is Elephant"+i);
		}
	}
	
}


class Horse extends Elephant implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++) 
		{
		System.out.println("My name is Horse"+i);
		}
	}
	
}


