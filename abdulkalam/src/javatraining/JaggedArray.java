package javatraining;

public class JaggedArray {

	public static void main(String[] args)
	{
		int x[][]=new int[3][];
		x[0]=new int[4];
		x[1]=new int[5];
		x[2]=new int[2];
		
		
		int p[][]= {{3,3,5,4,4},{7,9,7},{1,5,4,3,2,4,4,5,5}};
		
		for(int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
			
		

	}

}
