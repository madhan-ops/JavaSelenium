package javatraining;

public class TwoDimensionalArray {

	public static void main(String[] args)
	{
		//int a[]= {8,2,2,7};
		//int b[]= {2,4,5,3};
		//int c[]= {3,1,65,53};
		
		int p[][]= {{8,2,2,7},{2,4,5,3},{3,1,65,53}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p[i][j]+ " ");
			}
			System.out.println("");
		}
		

	}

}
