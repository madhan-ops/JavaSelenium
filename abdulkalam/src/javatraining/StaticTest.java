package javatraining;

interface StaticTest 
{
	static int shows()
	{
		int i=5,j=6,k;
		k=i+j;
		return k;
	}
}
class Axe implements StaticTest
{
	public static void main(String[] args)
	{
		//Axe obj=new Axe();
		StaticTest.shows();
	}
}

//class Balix implements StaticTest
//{
//	public void run()
//	{
//		System.out.println("in class");
//	}
//}