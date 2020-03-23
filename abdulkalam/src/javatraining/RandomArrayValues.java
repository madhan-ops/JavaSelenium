package javatraining;

import java.util.Random;

public class RandomArrayValues {

	public static void main(String[] args) 
	{
		Random r=new Random();
		
		int a[]=new int[20];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(100);
		
		}
		for(int j : a)
		{
			System.out.println(j);
		}
		try
		{
		System.out.println(a[89]);
		}
		catch(Exception e)
		{
			System.out.println("Maximum Number is 19");	
		}
		
	}

}
