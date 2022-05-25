
public class JavaWithoutMain {
	
	public static void main(String[]args)
	{
		Parent c=new Child("Kowlutla",20);
		System.out.println(c.getName());
	}

}


class Parent
{
	String name;
	public Parent(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return "Parent Name";
	}
	
	public String toString()
	{
		return this.name;
	}
}

class Child extends Parent
{
	int age;
	public Child(String name,int age)
	{
		super(name);
		this.age=age;
	}
	
	@Override
	public String getName()
	{
		return "Child Name";
	}
	
	public String toString()
	{
		return super.toString()+" "+this.age;
	}
}
