package Programs_for_interview;

import java.util.Arrays;

public class Reverse_String {

	public static void revrse_using_for() {

		String str = "Hello";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void StringBuilder() {
		String str = "World";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

	public static void char_Array() {
		String str= "Amazon";	
		char[] chararry = str.toCharArray();
		int left= 0, right= str.length()-1;
		char temp = chararry[left];
		chararry[left]= chararry[right];
		chararry[right]= temp;
		left++;
		right--;
		System.err.println(new String(chararry)); 
	}

	
	public static void main(String[] args) {
//	 revrse_using_for();
//		StringBuilder();
		char_Array();
	}
}
