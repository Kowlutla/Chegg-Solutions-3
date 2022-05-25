package com.chegg.intern.copy;

//class InternshipDemo that implements Printable Interface
public class InternshipDemo implements Printable {
	
	//Overrided method printTitle
	@Override
	public void printTitle(String faculty) {
		
		//diaplay faculty name 
		System.out.println(faculty+" Internship Programme List");
		
		//create four internship Objects
		Internship i1=new Internship("Siti Alma", 123456, 3.5, 'P');
		Internship i2=new Internship("Jason Leong", 234567, 3.0, 'K');
		Internship i3=new Internship("Sivarajan John", 345678, 2.8, 'F');
		Internship i4=new Internship("Amelia Bong", 456789, 2.3, 'P');
		
		//display the info of all internships
		i1.displayInfo();
		i2.displayInfo();
		i3.displayInfo();
		i4.displayInfo();
	}
}
