package javatraining;

public class ShallowCopyObject {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Shallow ob=new Shallow();
		ob.i=9;
		ob.j=4;
		ob.show();
		
		Shallow ob1=ob;
		ob1.show();
	
		

	}

}
class Shallow
{
	int i,j;
	public void show()
	{
		System.out.println("values of i and j are : "+i+" "+j);
	}
}