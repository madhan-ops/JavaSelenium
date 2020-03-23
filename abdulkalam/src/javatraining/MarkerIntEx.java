package javatraining;

public class MarkerIntEx {

	public static void main(String[] args) 
	{
		Mark obz=new Mark();
		if(obz instanceof Park)
			obz.add();
		else
			System.out.println("No permission");
	}

}
class Mark implements Park
{
	public void add()
	{
		System.out.println("Hello");
	}
}
interface Park
{
	
}