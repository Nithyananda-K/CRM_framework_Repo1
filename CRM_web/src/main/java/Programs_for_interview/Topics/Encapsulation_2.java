package Programs_for_interview.Topics;

//Product class demonstrating Encapsulation
class Product {
	private double price; // Private variable to ensure data security

	// Constructor
	public Product(double price) {
		this.price = price;
	}

	// Getter method to retrieve price
	public double getPrice() {
		return price;
	}

	// Setter method to update price with validation
	public void setPrice(double newPrice) {
		if (newPrice > 0) { // Ensuring valid price update
			this.price = newPrice;
			System.out.println("Price updated successfully to: ₹" + newPrice);
		} else {
			System.out.println("Invalid price update!");
		}
	}
}

//Main Class
public class Encapsulation_2 {
	public static void main(String[] args) {
		// Creating a Product object
		Product product = new Product(1500.50);

		// Displaying initial price
		System.out.println("Initial Price: ₹" + product.getPrice());

		// Updating the price with a valid value
		product.setPrice(2000.75);

		// Trying to update the price with an invalid value
		product.setPrice(-500);
	}
}
