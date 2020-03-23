package javatraining;

public class MethodOverloading {

	public static void main(String[] args)
	{
		Overload od=new Overload();
		
		od.show(4,5.4f);
	}

}

class Overload   // Method Overloading, Early Binding, Static Binding, Compile run polymorphism
{

	public void show()
	{
		System.out.println("Just a number");
	}
	public void show(float i)
	{
		System.out.println("Float Number");
	}
	public void show(char i)
	{
		System.out.println("Character");
	}
	public void show(int i,float f)
	{
		System.out.println("Integer and Float number");
	}
	
}