package javatraining;

public class EnhancedForLoopTwoDArray {

	public static void main(String[] args)
	{
		int q[][]= {{4,9,5,7},{9,3,6,4},{2,0,7,8}};
		
		for(int i[] : q)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		

	}

}
