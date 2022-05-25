package com.chegg.cus;

import java.util.Arrays;

public class CustomerDemo {

	// method to sort Customers array based on Date Of Birth
	static Customer[] sortCustomerByDob(Customer[] objArray) {

		Arrays.sort(objArray, (c1, c2) -> {
			return c1.getDob().compareTo(c2.getDob());
		});
		return objArray;
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer(59, "izlmoem", "ahjtxjx", 572.10, "qfealhm", 60);
		Customer customer2 = new Customer(72, "ejozjvf", "fhepzji", 353.0, "dwzbvuz", 79);
		Customer customer3 = new Customer(69, "pzppkkvb", "qusehml", 85.0, "jdkjyak", 85);
		Customer customer4 = new Customer(88, "jbmawow", "fuihkfg", 344.0, "sxealpr", 13);
		Customer customer5 = new Customer(7, "zfwlhpm", "lmbgdtk", 372.0, "ucrsjqb", 15);

		Customer[] objArray = { customer1, customer2, customer3, customer4, customer5 };

		Customer[] objArrayRes = sortCustomerByDob(objArray);
		System.out.println("Displaying the contents of array: ");
		for (Customer customer : objArrayRes) {
			System.out.println(customer.getId() + " " + customer.getName() + " " + customer.getDob() + " "
					+ customer.getSalary() + " " + customer.getEmail() + " " + customer.getAge());
		}
	}
}
