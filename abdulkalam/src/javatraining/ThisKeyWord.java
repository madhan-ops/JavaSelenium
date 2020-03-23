package javatraining;

public class ThisKeyWord {

	public static void main(String[] args)
	{
		Ram r=new Ram();
		r.setI(19);
		System.out.println("Value of I is : "+ r.getI());

	}

}
class Ram
{
	private int i;
	
	public void setI(int i)
	{
		this.i=i;
	}
	public int getI()
	{
		return i;
	}
	
}