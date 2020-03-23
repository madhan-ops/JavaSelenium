package javatraining;

public class StringImmutable {

	public static void main(String[] args)
	{
		String s1,s2,s3;
		
		s1="Sachin";
		s2="Yuvraj";
		s3="Sachin";
		s1="Kaif";
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String val= "Madhan,Suresh,Rahul,Ramesh,Madhan";
		String s[]=val.split(",");
		
		
		for(String i : s)
		{
			System.out.println(i);
		}
	
	
	}

}
