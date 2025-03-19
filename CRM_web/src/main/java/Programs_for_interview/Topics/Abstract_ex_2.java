package Programs_for_interview.Topics;

//Abstract Class
abstract class Payment {
	abstract void processPayment(double amount); // Abstract method
	
	void checkRequest(int Account_id) {
		System.out.println("Processing your check leaf " + Account_id);
	}
	
}

//Implementation for Credit Card Payment
class CreditCardPayment extends Payment {
	
	@Override
	void processPayment(double amount) {
		System.out.println("Processing Credit Card Payment of ₹" + amount);
	}
}

//Implementation for UPI Payment
class UpiPayment extends Payment {
	
	@Override
	void processPayment(double amount) {
		System.out.println("Processing UPI Payment of ₹" + amount);
	}
}

//Main Class
public class Abstract_ex_2 {
	public static void main(String[] args) {
		// Creating objects for different payment methods
		Payment creditCard = new CreditCardPayment();
		Payment upi = new UpiPayment();

		// Processing payments
		creditCard.processPayment(5000.75);
		upi.processPayment(1200.50);
		
		creditCard.checkRequest(12);
	}
}
