
// Throwable is a class. Exception and Error will extend Throwable class. Exceptions are of two types
// Checked Exceptions (IOException,SQLException....) and UnChecked Exceptions(ArrayIndexOutofbound, ElementNotFound...)
//All runtime exceptions are UnChecked Exceptions





package javatraining;

public class UnCheckedException 
{
	public static void main(String[] args) 
	{
		int x[]= {3,4,3,0,3};
		try
		{
		System.out.println(x[5]);
		}
		catch(Exception e)
		{
			System.out.println("Array can accept only 5 Integers");
		}
		
		int i,j,k;
		
		i=8;j=0;k=0;
		try
		{
			k=i/j;
			System.out.println(k);
		}
		catch(Exception ex)
		{
			System.out.println("Cant divide by Zero");
		}
		j=2;
		try
		{
			k=i/j;
			System.out.println(k);
		}
		catch(Exception ex)
		{
			System.out.println("Cant divide by Zero");
		}
}
}