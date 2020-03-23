package javatraining;

import java.util.Random;

public class ThreeDimArray {

	public static void main(String[] args) 
	{
		int x[][][]=new int[4][4][4];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					Random r=new Random();
					x[i][j][k]= r.nextInt(9);
					
				}
			}
		}
		
		for(int p[][] : x)
		{
			for(int q[] : p)
			{
				for(int r : q)
				{
					
					System.out.print(r+" ");
					
				}
				System.out.println("");
			}
		}
		

		
		
		
	}

}
