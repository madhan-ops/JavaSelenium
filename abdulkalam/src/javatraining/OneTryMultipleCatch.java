

package javatraining;

//import java.io.IOException;
import java.nio.channels.AlreadyBoundException;

public class OneTryMultipleCatch {

	public static void main(String[] args)
	
	{
		int i=2,j=4,k=0;
		int r;
		
		try
		{
			r=(i+j)/k;
			System.out.println(r);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error during Addition "+ex);
		}
		catch(AlreadyBoundException e)
		{
			System.out.println("Error during Addition"+e);
		}
		
		
	}

}
