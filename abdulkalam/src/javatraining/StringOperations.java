package javatraining;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		// Concatenating Two Strings
		String s3=s1.concat(s2);
		System.out.println("Result of Concatenatin is "+s3);
		
		//Finding length of the Strings
		
		int l1=s1.length();
		int l2=s2.length();
		System.out.println("Length of First string is : "+l1);
		System.out.println("Length of Second string is : "+l2);
		
		//Converting first string to Upper case and Second String to Lower Case
		
		s1=s1.toUpperCase();
		s2=s2.toLowerCase();
		System.out.println(" First string in Upper case : "+s1);
		System.out.println("Second string in Lower case : "+s2);
		
		sc.close();
	}

}
