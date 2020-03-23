package javatraining;

import java.util.Scanner;

public class ThrowForcedError 
{

	public static void main(String[] args) 
	{
	
		int i,j,k=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		i=sc.nextInt();
		j=sc.nextInt();
		
		try
		{
			k=i+j;
			if(k<10)
			{
				throw new ArithmeticException();
			}
			else
			{
				System.out.println(k);
			}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Number should not be less than 10");
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
		finally
		{
			sc.close();
			System.out.println("Madhan Program");
		}
		
		
		
		
		

	}

}
