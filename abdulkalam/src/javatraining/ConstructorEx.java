package javatraining;

public class ConstructorEx {

	public static void main(String[] args) 
	
	{
		Abc obj=new Abc(2.4f);
		obj.show();
	}

}
class Abc
{
	public Abc()
	{
		System.out.println("String method called");
	}
	public Abc(int i)
	{
		System.out.println(i+" Int method called");
	}
	public Abc(float i)
	{
		System.out.println(i+" float method called");
	}
	public Abc(int i,float j)
	{
		System.out.println(i+j+" float method called");
	}
	public Abc(String[] i)
	{
		System.out.println(i+" String ori method called");
	}
	public void show()
	{
		System.out.println("Show Method called");
	}
}