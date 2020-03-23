package javatraining;

public class FinalEx 
{

	public static void main(String[] args)
	{
		B obj=new B();
		obj.i=60;
		obj.j=15;
		System.out.println(obj.div());
		System.out.println(obj.mul());
		//final int a=10;
		// a=43;
	}

}
  class A         			/* final */		//Does not allow the class to be inherited
{
	public int i,j,k;
	public int mul()        /*final */		//Does not allow the Constructor to be inherited
	{
		k=i*j;
		return k;
	}
}

class B extends A
{
	public int div()
	{
		k=i/j;
		return k;
	}
}