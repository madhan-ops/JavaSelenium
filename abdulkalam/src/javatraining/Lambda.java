package javatraining;

interface FED
{
	void show();
}

public class Lambda {

	public static void main(String[] args)
	{
		FED obj = () -> System.out.println("in show");
		obj.show();
	}

}
