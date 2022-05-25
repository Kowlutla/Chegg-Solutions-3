import java.util.Date;

//the class name is Student
public class Student {
	// all the attributes
	private String studentNo;
	private String studentName;
	private Date dateOfBirth;
	private Integer meritPoints;

	public static int noOfStudents;

	// Mutator methods
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setMeritPoints(Integer meritPoints) {

		// if meritPoints less than 20 assign minimum points
		if (meritPoints < 20) {
			this.meritPoints = 20;
		}
		// if meritPoints greater than 200 assign maximum points
		else if (meritPoints > 200) {
			this.meritPoints = 200;
		}
		// otherwise assign given points
		else {
			this.meritPoints = meritPoints;
		}
	}

	// Getter methods
	public String getStudentNo() {
		return studentNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getMeritPoints() {
		return meritPoints;
	}

	public String getStudentName() {
		return studentName;
	}

	// a constructor that initializes all attributes
	public Student(String studentNo, String studentName, Date dateOfBirth, Integer meritPoints) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;

		// if meritPoints less than 20 assign minimum points
		if (meritPoints < 20) {
			this.meritPoints = 20;
		}
		// if meritPoints greater than 200 assign maximum points
		else if (meritPoints > 200) {
			this.meritPoints = 200;
		}
		// otherwise assign given points
		else {
			this.meritPoints = meritPoints;
		}
	}

	/*
	 * a method countStudent that incremented the number of a Student instance every
	 * time one is created
	 */
	public void countStudent() {
		noOfStudents++;
	}

}