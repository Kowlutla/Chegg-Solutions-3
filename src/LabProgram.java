import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		int [][]array= {{1,0,1,1,1},{1,1,1,0,1},{0,0,1,0,0,},{0,0,1,0,1},{1,0,1,1,1,}};
		
		System.out.println("Index is: "+smallest(array));
	}
	
	
	static int smallest(int [][]mat)
	{
		int n=mat.length;
		for(int i=0;i<n;i++)
		{
			if(checkRow(mat,i) && checkCol(mat,i))
			{
				return i;
			}
		}
		return -1;
	}
	
	static boolean checkRow(int[][]mat,int row)
	{
		for(int i=0;i<mat.length;i++)
		{
			if(i!=row && mat[row][i]==1)
			{
				return false;
			}
		}
		return true;
	}
	static boolean checkCol(int[][]mat,int col)
	{
		for(int i=0;i<mat.length;i++)
		{
			if(i!=col && mat[i][col]==0)
			{
				return false;
			}
		}
		return true;
	}
}
