package javatraining;

public class AbstractMethod
{

	public static void main(String[] args)
	{
	//	Iphone ih=new Iphone();
		Samsung sh=new Samsung();
		show(sh);		
	}
	public static void show(Phone obj)
	{
		obj.showConfig();
	}

}

abstract class Phone
{
	abstract public void showConfig();
}

class Iphone extends Phone
{
	public void showConfig()
	{
		System.out.println("2gb Ram, 34gb Rom");
	}
}
class Samsung extends Phone
{
	public void showConfig()
	{
		System.out.println("6gb Ram, 64gb Rom");
	}
}
