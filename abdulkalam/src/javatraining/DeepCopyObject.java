package javatraining;

public class DeepCopyObject {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Deep ob=new Deep();
		ob.i=9;
		ob.j=4;
		ob.show();
		
		Deep ob1=new Deep();
		ob1.i=ob.i;
		ob1.j=ob.j;
		ob1.show();

	}

}

class Deep
{
	int i,j;
	public void show()
	{
		System.out.println("values of i and j are : "+i+" "+j);
	}
}
