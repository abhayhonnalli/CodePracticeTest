package codingpracticetest;

public class Employee {
	
	String FirstName;
	String LastName;
	public Employee(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	 
}
