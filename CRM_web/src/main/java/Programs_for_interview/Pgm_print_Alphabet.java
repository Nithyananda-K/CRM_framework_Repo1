package Programs_for_interview;

public class Pgm_print_Alphabet {
	
	
	
	public static void A_Z_from_nu() {
		for(int i= 65; i<90; i++) {
			System.out.print(" "+(char)i);                     //A B C D E F G H I J K L M N O P Q R S T U V W X Y
		}
		
	}
	
	public static void A_Z_from_char() {
		for(char ch='A'; ch<'Z'; ch++) {
			System.out.print(" "+ ch);                         //A B C D E F G H I J K L M N O P Q R S T U V W X Y
		}
		
	}
	
	public static void main(String[] args) {
//		A_Z_from_nu();
		A_Z_from_char();
	}
}
