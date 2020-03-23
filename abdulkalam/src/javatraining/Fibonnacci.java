package javatraining;

import java.util.Scanner;

public class Fibonnacci
{

	public static void main(String[] arr) 
	{
		
		
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		int a=1,b=1,k=0;
		while(k<n)
		{
			
			k=a+b;
			if(k>n)
				break;
			else
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		
	}

}
