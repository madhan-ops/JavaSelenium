// Static is a keyword used in java with the member functions or member variables of your class so that 
//we can call those members without instantiating the object.

package javatraining;

public class StaticMethodAndStaticVariable {

	public static void main(String[] args)
	{
		
		Rahul.show();
	}

}
class Rahul
{
	static int i=5;
	public static void show()
	{
		System.out.println("Hello!"+i);
		
	}
}