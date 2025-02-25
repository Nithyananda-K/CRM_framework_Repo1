package Programs_for_interview;

import java.util.Scanner;

import org.testng.annotations.Test;

public class print_num_1_to_10 {

	public static void fLoop() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}


	public static void wLoop() {
		int no= 0;
		 while(no<=10) {
			 System.out.println(no);
			 no++;
		 }
	}
	
	public static void freverseNu() {	
		Scanner sc= new Scanner(System.in);
		int start= sc.nextInt();
		int end= sc.nextInt();

		for(int i= start; i>end; i--) {
			System.out.println(i);
		}
	}
	
	public static void wreversNu() {
		Scanner sc= new Scanner(System.in);
		int start= sc.nextInt();
		int end= sc.nextInt();
		
		while(start >=end) {
			System.out.println(start);
			start--;
		}
	}
		
	public static void main(String[] args) {
//		fLoop();
//		wLoop();
//		freverseNu();
		wreversNu();
	}

}
