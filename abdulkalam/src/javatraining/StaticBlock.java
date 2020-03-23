//Static block will be executed first before the Main Method

package javatraining;

public class StaticBlock 
{
	static String s="";
	static
	{
		System.out.println("I am in Static");
		s="Madhan";
	}
	
	public static void main(String[] args)
	{
		System.out.println("I am in Main Method : "+s);
		
		

	}

}
