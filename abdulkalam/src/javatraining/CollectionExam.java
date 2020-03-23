//Collection is an interface. Collection is a frame

package javatraining;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExam {

	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		Collection<Comparable> cc=new ArrayList<Comparable>();
		cc.add(34);
		cc.add(4.5f);
		cc.add("Madhan");
		cc.add('A');
		cc.add(8.8);
		
		cc.remove(4.5f);
		
	//Using Enhanced for loop
		for(Object i : cc)
		{
			System.out.println(i);
		}
		
	// Using Iterator	
		@SuppressWarnings("rawtypes")
		Iterator it=cc.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
		
	}

}
