package javatraining;

public class MethodOverRiding {

	public static void main(String[] args) 
	{
		//Riding r=new Riding();
		SecondRiding sr=new SecondRiding();
		
		System.out.println(sr.add());

	}

}

class Riding
{
	int i=12,j=4,k;
	public int add()
	{
		k=i+j;
		return k;
	}
}

class SecondRiding extends Riding
{
	public int add()
	{
		k=i-j;
		return k;
	}
}