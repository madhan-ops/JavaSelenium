package javatraining;

public class VarArgs {

	public static void main(String[] args)
	{
		Display obj=new Display();
		obj.show(5,8,6,5,0);

	}

}
class Display
{
	public void show(int ... a)
	{
		for(int i : a)
		System.out.print(i+ " ");
	}
	
	public void show(int a)
	{
		System.out.print(a+ " in show a");
	}
	
}