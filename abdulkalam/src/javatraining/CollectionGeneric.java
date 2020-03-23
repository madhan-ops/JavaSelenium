//collection   --> Topic
//Collection  --> Interface
//Collections  --> Class



package javatraining;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGeneric {

	public static void main(String[] args) 
	{
		Collection<Integer> co=new ArrayList<Integer>();
		co.add(5);
		co.add(6);
		co.add(7);
		co.add(98);
		co.remove(6);
		for(Object i : co)
		{
			System.out.println(i);
		}

	}

}
