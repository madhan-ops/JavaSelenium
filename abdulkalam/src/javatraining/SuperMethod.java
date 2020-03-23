package javatraining;

public class SuperMethod {

	public static void main(String[] args)
	{
	         Bali bl=new Bali(5);
	         bl.show();
	}

}

class Ant
{
	public Ant()
	{
		System.out.println("Normal Ant Constructor");
	}
	public Ant(int i)
	{
		System.out.println("Int Ant Constructor");
	}
	public void show()
	{
		
	}
}
class Bali extends Ant
{

	public Bali()
	{
		System.out.println("Normal Bali Constructor");
	}
	public Bali(int i)
	{
		super();
		System.out.println("Int Bali Constructor");
	}
}