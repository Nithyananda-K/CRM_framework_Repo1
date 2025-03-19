package Programs_for_interview.Topics;

//Abstract Class
abstract class Order {
	abstract void processOrder(); // Abstract method
}

//Concrete Class 1
class NormalOrder extends Order {
	@Override
	void processOrder() {
		System.out.println("Processing a normal order with standard delivery.");
	}
}

//Concrete Class 2
class BulkOrder extends Order {
	@Override
	void processOrder() {
		System.out.println("Processing a bulk order with discounted pricing.");
	}
}

//Main Class
public class Abstract_ex_1 {
	public static void main(String[] args) {
		// Creating objects of NormalOrder and BulkOrder
		Order normalOrder = new NormalOrder();
		Order bulkOrder = new BulkOrder();

		// Processing orders
		normalOrder.processOrder();
		bulkOrder.processOrder();
	}
}
