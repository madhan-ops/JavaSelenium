package javatraining;

public class WrapperEx 
{
	public static void main(String args[])
	{
		Integer i=new Integer(8);
		System.out.println(i);
		
		
		//Wrapping
		char c='m';
		
		Character b=new Character(c);
		
		char d=b.charValue();
		System.out.println(d);
		
		//UnWrapping
		
		Float f=new Float(4.7f);
		
		float x;
		x=f.floatValue();
		
		System.out.println(x);
	}
}
