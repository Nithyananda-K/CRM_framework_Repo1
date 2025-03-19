package Programs_for_interview;

import java.util.Arrays;

public class Find_MaxNumber_array {

	static void findmaxNum_In_Arry() {
		int[] arr = { 12, 45, 7, 89, 34, 90, 23 };

		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int min =arr[0];
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);

	}

	static void findmaxNum_In_Arry_1() {

		int[] arr = { 12, 45, 7, 89, 34, 90, 23 };
		int max = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Maximum number: " + max);
	}

	public static void main(String[] args) {
//		findmaxNum_In_Arry();
		findmaxNum_In_Arry_1();
	}

}
