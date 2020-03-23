package javatraining;

public class StringSplit {

	public static void main(String[] args)
	
	{
		String s="Madhan,Swathi,Manohar,Vijaya";
		String sep[]=s.split(",");
		
		System.out.println(sep[2]);
		System.out.println(sep[3]);
		
		for(String val :  sep)
		{
			System.out.println(val);
		}
	}

}
