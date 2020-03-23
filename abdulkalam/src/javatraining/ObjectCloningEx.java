package javatraining;

public class ObjectCloningEx {

	public static void main(String[] args) throws CloneNotSupportedException
	
	{

		Deepu ob=new Deepu();
		ob.i=9;
		ob.j=4;
		ob.show();
		
		Deepu ob1=(Deepu)ob.clone();
		
		ob1.j=3;
		ob1.i=1;
		ob1.show();
	}

}

class Deepu implements Cloneable
{
	int i,j;
	public void show()
	{
		System.out.println("values of i and j are : "+i+" "+j);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

