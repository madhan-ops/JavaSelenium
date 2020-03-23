package javatraining;

public class AbstractClassDemo
{

	public static void main(String[] args) 
	{
		TharunPhone ph=new MadhanPhone();
		ph.call();
		ph.dance();
		ph.move();
		ph.sing();
	}

}
abstract class TharunPhone
{
	public void call()
	{
		System.out.println("Calling.....");
	}
	public abstract void dance();
	public abstract void move();
	public abstract void sing();
}
abstract class EswarPhone extends TharunPhone
{
	public void move()
	{
		System.out.println("Moving....");
	}
	public void dance()
	{
		System.out.println("Dancing....");
	}
}
class MadhanPhone extends EswarPhone
{
	public void sing()
	{
		System.out.println("Singing...");
	}
}