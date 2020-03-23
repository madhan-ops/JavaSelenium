package javatraining;

public class ImplicitConversionConstructor {

	public static void main(String[] args)
	{
		Xyzq p=new Xyzq(5.8);
		p.display();
	}

}
class Xyzq
{
	public Xyzq()
	{
		System.out.println("Method Called");
	}
	
	public Xyzq(int i)
	{
		System.out.println("Int Method Called");
	}
	public Xyzq(double d)
	{
		System.out.println("Double Method Called");
	}
	public void display()
	{
		System.out.println("display method");
	}
	
}