package Programs_for_interview;

public class FibonacciIterative {

	public static void fibonacci_with_for() {
		int n = 10, a = 0, b = 1;
		System.out.print("Fibonacci Series: " + a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			int next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}
	}

	public static int fibonacciRecur(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
	}

	public static void main(String[] args) {
//		
		int n = 13; // Find the first 13 Fibonacci numbers
		System.out.print("Fibonacci Series: ");

		for (int i = 0; i < n; i++) { // Loop to print the series
			System.out.print(fibonacciRecur(i) + " ");
		}
		
		System.out.println();
		System.out.println("below output is from normal approach --> ");
		fibonacci_with_for();
		
	}
}
