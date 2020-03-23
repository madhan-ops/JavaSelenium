package javatraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {

	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<>();
		li.add(87);
		li.add(98);
		li.add(3);
		li.add(9);
		li.add(90);
		li.add(2,55);
		
//		for(Object z: li)
//		{
//			System.out.println(z);
//			
//		}
		Collections.sort(li);
		
		for(Object z: li)
		{
			System.out.println(z);
			
		}
		
		li.forEach(System.out::println);
		
		
	
				

	}

}
