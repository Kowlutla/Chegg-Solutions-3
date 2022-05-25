import java.time.LocalDate;
import java.time.Period;

public class Encyption {

	public static void main(String[] args) {
		
		LocalDate birth=LocalDate.of(2000, 5, 5);
		LocalDate current=LocalDate.now();
		Period p=Period.between(birth, current);
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays());;
	}
}

class Student1
{
	int id;
	public Student1(int id)
	{
		this.id=id;
	}
	
	public String toString()
	{
		return "ID: "+this.id;
	}
}
