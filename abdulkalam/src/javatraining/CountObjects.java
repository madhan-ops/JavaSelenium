//No. of object can be counted for a class using static variable

package javatraining;

public class CountObjects {

	public static void main(String[] args)
	{
//		Count x=new Count();
//		Count y=new Count();
//		Count z=new Count();
//		Count a=new Count();
//		Count b=new Count();
		Count c=new Count();
		c.total();
	}

}
class Count
{
	static int i;
	public Count()
	{
		
		i++;
	}
	
	public void total()
	{
		System.out.println(i);
	}
}