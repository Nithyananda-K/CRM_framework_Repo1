package Programs_for_interview;

public class sum_of_digit {

	public static void sumOf_digit_use_while() {
		int value = 154;
		int sum = 0; // Initialize sum as 0 for addition

		while (value != 0) { // Loop until value becomes 0
			sum = sum + value % 10; // Extract last digit and add to sum
			value = value / 10; // Remove last digit
		}

		System.out.println("Sum of digits: " + sum);
	}

	public static void sumOf_digit_use_for() {
		int value = 154;
		int sum = 0;

		for (; value != 0; value /= 10) {          // Loop until value becomes 0
			sum += value % 10;                  // Extract last digit and add to sum
		}
		
		System.out.println("Sum of digits: " + sum);
	}

	public static void main(String[] args) {
		sumOf_digit_use_while();
		sumOf_digit_use_for();
		
	}
}
