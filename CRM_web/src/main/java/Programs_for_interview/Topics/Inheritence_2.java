package Programs_for_interview.Topics;

//Parent Class
class Employee {
	
	String name;
	double salary;

	// Constructor
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Method to display employee details
	void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

//Child Class (Developer inherits Employee)
class Developer extends Employee {
	String programmingLanguage;

	// Constructor
	public Developer(String name, double salary, String programmingLanguage) {
		super(name, salary); // Calling Parent class constructor
		this.programmingLanguage = programmingLanguage;
	}

	// Method to display developer details
	void showSkills() {
		System.out.println("Programming Language: " + programmingLanguage);
	}
}

//Main Class
public class Inheritence_2 {
	public static void main(String[] args) {
		// Creating a Developer object
		Developer dev = new Developer("John Doe", 70000, "Java");

		// Display Employee details (Inherited method)
		dev.displayDetails();

		// Display Developer-specific details
		dev.showSkills();
	}
}
