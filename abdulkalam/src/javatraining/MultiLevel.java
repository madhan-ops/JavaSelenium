package javatraining;

public class MultiLevel 
{

	public static void main(String[] args) 
	{
		Modulus x=new Modulus();
		x.i=10;
		x.j=2;
		x.mod();
		System.out.println(x.div());
		System.out.println(x.multiply());
		System.out.println(x.mod());
		

	}

}

class Multiplication
{
	int i,j,k;
	public int multiply()
	{
		k=i*j;
		return k;
	}
}

class Division extends Multiplication
{
	public int div()
	{
		k=i/j;
		return k;
	}
}

class Modulus extends Division
{
	public int mod()
			{
				k=i%j;
				return k;
				
			}
}
