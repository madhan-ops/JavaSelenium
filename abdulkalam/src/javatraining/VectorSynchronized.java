// Array List --> Increases capacity by 50 percent --> Not Synchronized --> Not Thread Safe->Fast
// Vector --> Increases capacity by 100 percent -->Synchronized --> Thread Safe->Slow

//Array list wins the race when compared to Vector		


package javatraining;

import java.util.Vector;

public class VectorSynchronized {

	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<>();
		v.add(87);
		v.add(34);
		v.add(7);
		v.add(346);
		v.add(87);
		v.add(34);
		v.add(7);
		v.add(34);
		v.add(8);
		v.add(346);
		v.add(87);
		v.remove(2);
		v.removeAllElements();
		
		for(int w : v)
		{
			System.out.println(w);
		}
		System.out.println(v.capacity());
		

	}

}
