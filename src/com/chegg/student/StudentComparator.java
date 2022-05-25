package com.chegg.student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		// if student1 gpa greater than student2 gpa
		if (s1.getGpa() > s2.getGpa()) {
			return 1;
		}
		// if student1 gpa less than student2 gpa
		else if (s1.getGpa() < s2.getGpa()) {
			return -1;
		}
		// if student1 gpa same student2 gpa
		else {
			// return name with lower alphabet order should be first
			return s1.getName().compareTo(s2.getName());
		}
	}

}
