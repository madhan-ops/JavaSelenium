package javatraining;

import java.util.Scanner;

public class MyExceptionErr {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		try
		{
		if(i<10)
		{
			throw new MyException("Value is less than 10");
		}
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			sc.close();
		}
	}

}
@SuppressWarnings("serial")
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}