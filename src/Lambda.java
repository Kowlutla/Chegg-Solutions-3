import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lambda {

	public static void main(String[] args) {

		int array[] = {6,5,8,4,7,10,9};
		//System.out.println(solve(array));
		
		String myString = "123 plus 43 equals 166";

		   Pattern p = Pattern.compile("[a-z]+");

		       Matcher m = p.matcher(myString);

		       while (m.find()) {

		           System.out.print(m.group()+";");

		        }

	}

	private static int solve(int array[]) {	
		List<Integer>set=new LinkedList<>();Question1:
		for(Integer i:array)
		{
			set.add(i);
		}
		
		int count=0;
		while(true)
		{
			int size1=set.size();
			System.out.println(set);
			for(int i=0;i<set.size()-1;i++)
			{
				if(set.get(i)<set.get(i+1))
				{
					set.remove(set.get(i+1));
					i--;
				}
			}
			
			
			int size2=set.size();
			if(size1!=size2)
			{
				count++;
			}
			else
			{
				return count;
			}
		}

	}

}
