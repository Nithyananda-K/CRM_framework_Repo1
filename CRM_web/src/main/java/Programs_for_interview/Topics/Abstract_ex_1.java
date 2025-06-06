package Programs_for_interview.Topics;

//Abstract Class
abstract class Order {
	abstract void processOrder(); // Abstract methods cannot be static & cannot have a body

	public abstract void CancelOrder();     //private ❌ Not allowed (private methods can't be overridden)
}

//Concrete Class 1
class NormalOrder extends Order {
	@Override
	void processOrder() {
		System.out.println("Processing a normal order with standard delivery.");
	}

	@Override
	public void CancelOrder() {
		// TODO Auto-generated method stub
		
	}
}

//Concrete Class 2
class BulkOrder extends Order {
	@Override
	void processOrder() {
		System.out.println("Processing a bulk order with discounted pricing.");
	}

	@Override
	public void CancelOrder() {
		// TODO Auto-generated method stub
	}
}

//Main Class
public class Abstract_ex_1 {
	public static void main(String[] args) {
		// Creating objects of NormalOrder and BulkOrder
		Order normalOrder = new NormalOrder();
		Order bulkOrder = new BulkOrder(); // Polymorphism:

		// Processing orders
		normalOrder.processOrder();
		bulkOrder.processOrder();
	}
}