package javatraining;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		Collection<Comparable> c=new ArrayList<Comparable>();
		c.add(4);
		c.add(8.8f);
		c.add(3.5);
		c.add("Madhan");
		
		for(Object i : c)
		{
			System.out.println(i);
		}

	}

}
