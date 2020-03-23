package javatraining;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FinallyExample {

	public static void main(String[] args)
	
	{
		int i=8,k=0;
		int j=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		try
		{
		j=Integer.parseInt(br.readLine());
		k=i/j;
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Arithmetic value given for j "+e);
		}
		catch(Exception ex)
		{
			System.out.println("Invalid value given for j "+ex);
		}
		finally
		{
		System.out.println("finally bye");
		}

	}

}
