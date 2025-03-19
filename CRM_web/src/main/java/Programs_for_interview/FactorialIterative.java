package Programs_for_interview;

public class FactorialIterative {

	public static int factorial1(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int factorialRecurse(int n) {
		if (n == 0)
			return 1;
		return n * factorialRecurse(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial1(5)); // Output: 120
		System.out.println(factorialRecurse(5));
	}
}