package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCustomer {

	public static void main(String[] args) {
			
		List<Person>persons=new ArrayList<>();
		persons.add(new Person("Mangali","Kowlutla",151337));
		persons.add(new Person("mangali","Kowlutla",151330));
		persons.add(new Person("Maruvada","Sudeepthi",151129));
		persons.add(new Person("Kalluri","Dheeraj",151335));
		
		Collections.sort(persons);
		for(Person p:persons) {
			System.out.println(p);
		}

	}

}
