package Programs_for_interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicat_number_in_array {

	static void removedduplicate() {
		int[] arry = { 1, 2, 3, 8, 9, 2, 8 };

		int no = 0;
		HashSet<Integer> setno = new HashSet<>();
		for (int i : arry) {
			setno.add(i);
		}
		System.out.println(setno);
	}

	static void printduplicate_using_arr() {
		int[] arr = { 1, 1, 2, 3, 8, 9, 2, 8, 6,6 };

		for (int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j <arr.length; j++) {    //To compare with 
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
//				System.out.println();
			}
		}
	}
	

	public static void main(String[] args) {
//		removedduplicate();
		printduplicate_using_arr();
		
	}
}
