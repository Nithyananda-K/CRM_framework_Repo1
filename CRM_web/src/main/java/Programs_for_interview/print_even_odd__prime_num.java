package Programs_for_interview;

import java.util.Scanner;

import org.testng.annotations.Test;

public class print_even_odd__prime_num {

	public static void fevennum() {
		for (int i = 0; i <= 10; i++) {
			
			if(i%2==0) {
				System.out.println(i);	
			}
		}
	}

	public static void foddnum() {
		for (int i = 0; i <= 10; i++) {
			
			if(i%2!=0) {
				System.out.println(i);	
			}
		}
	}
	
	public static void wLoop() {
		int no= 0;
		 while(no<=10) {
			 System.out.println(no);
			 no++;
		 }
	}
			
	public static void main(String[] args) {
//		fevennum();
		foddnum();
//		wLoop();
//		freverseNu();
	}
}
