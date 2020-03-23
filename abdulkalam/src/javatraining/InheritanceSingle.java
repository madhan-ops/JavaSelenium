package javatraining;

public class InheritanceSingle {

	public static void main(String[] args)
	{
		Subtraction subc=new Subtraction();
		
		subc.i=55;
		subc.j=15;
		System.out.println(subc.sum());
		System.out.println(subc.sub());
	}

}

class Addition
{
	int i,j,k;
	public int sum()
	{
		k=i+j;
		return k;
		
	}
}

class Subtraction extends Addition
{
	
	public int sub()
	{
		k=i-j;
		return k;
	}
}