package Programs_for_interview;

//Palindrome Check for Number
public class Palindrome {

	public static boolean isPalindrome1(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reversed);
	}

	public static boolean isPalindrome2(int num) {
		int original = num, reversed = 0;
		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return original == reversed; 
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome1("madam")); // true
		System.out.println(isPalindrome1("Selenium")); // false
		System.out.println(isPalindrome2(121)); // true
		System.out.println(isPalindrome2(123)); // false
		
		int i= 145;
		String s= String.valueOf(i);
	}

}
