package Programs_for_interview.Topics;

//Parent class representing a general User in the E-commerce system
class User {
	String name;
	String email;

	// Constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Common method for all users
	public void login() {
		System.out.println(name + " logged into the system using email: " + email);
	}
}

//Child class representing a Customer (inherits from User)
class Customer extends User {
	int customerId;

	// Constructor
	public Customer(String name, String email, int customerId) {
		super(name, email); // Calling parent class constructor
		this.customerId = customerId;
	}

	// Method specific to Customer
	public void browseProducts() {
		System.out.println(name + " is browsing products.");
	}

	public void placeOrder() {
		System.out.println(name + " placed an order successfully.");
	}
}

//Child class representing an Admin (inherits from User)
class Admin extends User {
	String adminRole;

	// Constructor
	public Admin(String name, String email, String adminRole) {
		super(name, email);
		this.adminRole = adminRole;
	}

	// Method specific to Admin
	public void manageProducts() {
		System.out.println(name + " (" + adminRole + ") is managing product inventory.");
	}
}

//Main class to test inheritance
public class Inheritence {
	public static void main(String[] args) {
		// Creating Customer object
		Customer customer = new Customer("Alice", "alice@example.com", 101);
		customer.login();
		customer.browseProducts();
		customer.placeOrder();

		System.out.println(); // Line break

		// Creating Admin object
		Admin admin = new Admin("Bob", "bob@ecommerce.com", "Product Manager");
		admin.login();
		admin.manageProducts();
	}
}
