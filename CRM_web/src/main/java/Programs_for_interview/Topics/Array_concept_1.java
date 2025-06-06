package Programs_for_interview.Topics;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_concept_1 {
	
	
	public static void modify(){
		// Modify
		int[] a = {1, 2, 3};
		System.out.println(a[0]);      // 1

		a[0] = 9;                      // replace the value
		System.out.println(a[0]);      // 9

		System.out.println(a.length); // 3
	}
	
	public static void read(){
	
		//Loop (Read & Modify)
		int[] arr = {1, 2, 3};
		for (int i=0; i < arr.length; i++) {
		    arr[i] = arr[i] * 2;
		    System.out.print(arr[i] + " ");              // Outputs: 2 4 6
		}
	}
	
	public static void Loop(){
		
		//Loop (Read)
		String[] arr = {"a", "b", "c"};
		
		for (String a: arr) {
		    System.out.print(a + " ");                  // Outputs: a b c 
		}
		
	}
	

	public static void Two_DArray() {
		// 2d Array
		int[][] marks = {
	            {85, 90, 80},   // Marks of Student 1
	            {75, 88, 92}    // Marks of Student 2
	        };

	        // Accessing elements and printing
	        System.out.println("Student 1, Subject 2 Marks: " + marks[0][1]);  // Output: 90

	        // Looping through 2D array
	        for (int i = 0; i < marks.length; i++) {
	            System.out.print("Student " + (i + 1) + " marks: ");
	            for (int j = 0; j < marks[i].length; j++) {
	                System.out.print(marks[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	}
	
	public static void main(String[] args) {
		
		//Declare
		int[] a1;                          // Declaration of an integer array (no memory allocated yet)

		int[] a2 = {1, 2, 3};              // Declaration and initialization using array literal

		int[] a3 = new int[]{1, 2, 3};     // Another way to declare and initialize an array

		int[] a4 = new int[4];             // Creates an array of size 4 (indices: 0 to 3)
		a4[0] = 1;                         // Assigns 1 to index 0
		a4[2] = 2;                         // Assigns 2 to index 2
		a4[3] = 3;                         // Assigns 3 to index 3
		
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		Set<Integer> set = new LinkedHashSet<>();        // it removes duplicates and maintains insertion order.
		for (int num : arr) set.add(num);
		System.out.println(set);  // [1, 2, 3, 4, 5]     // Note: hashset removes duplicates but order is not guaranteed   
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}
}


