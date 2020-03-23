package javatraining;

interface Abcd
{
	void talk();
}

class Bcd implements Abcd
{
	public void talk()
	{
		System.out.println("Talking....");
	}
}

public class Xyz
{
	public static void main(String[] args)
	{
		Abcd ob=new Bcd();
		ob.talk();
	}
}

