import java.util.Random;

public class ChildFinal extends Final {
	
	private int upperbound;
	private int key;
	
	public ChildFinal(int r, int c, int upperbound, int key) {
		super(r, c);
		this.upperbound = upperbound;
		this.key = key;
	}

	@Override
	public void fillTable() {
		
		Random rand=new Random();
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[i].length;j++)
			{
				table[i][j]=rand.nextInt(upperbound+1);
			}
		}

	}

	@Override
	public int[][] transformTable() {
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[i].length;j++)
			{
				if(table[i][j]>=key)
				{
					table[i][j]=1;
				}
				else
				{
					table[i][j]=0;
				}
			}
		}
		return table;
	}

	@Override
	public int countOneTable(int[][] table) {
		
		int count=0;
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[i].length;j++)
			{
				if(table[i][j]==1)
				{
					count++;
				}
			}
		}
		return count;
	}

}
