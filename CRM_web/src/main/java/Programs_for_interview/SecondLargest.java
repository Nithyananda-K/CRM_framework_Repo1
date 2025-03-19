package Programs_for_interview;

public class SecondLargest {
	public static void findSecondLargest() {

		int[] numbers = { 12, 35, 1, 10, 34, 1 };
		int largest = Integer.MIN_VALUE;
		int secondlarg = Integer.MIN_VALUE;
		

		for (int no : numbers) {
			if (no > largest) {
				secondlarg = largest;
				largest = no;
			}else if(no> secondlarg && no != largest) {
				secondlarg= no;	
			}
		}
		System.out.println(secondlarg);
	}

	public static void main(String[] args) {
		findSecondLargest(); // Output: 34
	}
}

//int[] numbers = { 12, 35, 1, 10, 34, 1 };
//int largest = Integer.MIN_VALUE;
//int secondLargest = Integer.MIN_VALUE;
//int thirdLargest = Integer.MIN_VALUE;
//
//for (int no : numbers) {
//    if (no > largest) {
//        thirdLargest = secondLargest;
//        secondLargest = largest;
//        largest = no;
//    } else if (no > secondLargest && no != largest) {
//        thirdLargest = secondLargest;
//        secondLargest = no;
//    } else if (no > thirdLargest && no != secondLargest && no != largest) {
//        thirdLargest = no;
//    }
//}
//
//System.out.println("Third Largest: " + thirdLargest);
//}
