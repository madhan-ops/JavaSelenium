package javatraining;

public class ObjectInherit {

	public static void main(String[] args) 
	{
		Duplicate d=new Duplicate();
		d.show();
				
	}

}

class Original
{
	public Original()
	{
		System.out.println("I am Original");	
	}
	public Original(int i)
	{
		System.out.println("I am int original");
	}
}

class Duplicate extends Original
{
	public Duplicate()
	{
		System.out.println("I am duplicate");
	}
	public Duplicate(int i)
	{
		System.out.println("I am int duplicate");
	}
	public void show()
	{
		
	}
}