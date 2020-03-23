//Non static members can be called in Static method

package javatraining;

public class NonStatic {

	public static void main(String[] args) 
	
	{
		Non x=new Non();
		x.display();

	}

}
class Non
{
	static int i=7;
	static int j=9;
	public void display()
	{
		System.out.println(i+" "+j);
		
	}
}