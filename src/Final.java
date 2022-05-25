
public abstract class Final {
	
	private int row;
	private int column;
	public int[][]table;
	
	public Final(int r,int c)
	{
		this.row=r;
		this.column=c;
		table=new int[row][column];
	}
	
	public void hi()
	{
		System.out.println("hi");
	}
	
	public abstract void fillTable();
	public abstract int[][]transformTable();
	
	public abstract int countOneTable(int[][]table);

}
