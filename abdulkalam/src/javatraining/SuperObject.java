package javatraining;

public class SuperObject 
{

	public static void main(String[] args)
	{
		Obj2 cr=new Obj2();
		cr.show();
		
	}

}

class Obj1
{
	int i=4;
	public Obj1()
	{
		System.out.println("Normal Integer Obj1");
	}
	public Obj1(float i)
	{
		System.out.println("float Integer Obj1");
	}
	public void show() {
		System.out.println(i);
		
	}
}

class Obj2 extends Obj1
{
	
	
	int i=8;
	public Obj2()
	{
		System.out.println("Normal Integer Obj2");
	}
	public Obj2(float i)
	{
		System.out.println("float Integer Obj2");
	}
	public void show()
	{
		super.show();
		System.out.println(i);
	}
}