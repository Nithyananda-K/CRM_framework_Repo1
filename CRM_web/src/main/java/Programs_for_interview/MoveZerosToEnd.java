package Programs_for_interview;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToEnd {

	static void addZeroLastfor_int() {
		long num = 12030038036L;

		String str = String.valueOf(num);
		int zeroCount = 0;
		
		StringBuilder nonZeroPart = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch == '0') {
				zeroCount++;
			} else {
				nonZeroPart.append(ch);
			}
		}
		
//		nonZeroPart.append("0".repeat(zeroCount));
//		System.out.println(nonZeroPart.toString());

        String result = "0".repeat(zeroCount) + nonZeroPart;
        System.out.println(result);
	}

	
	static void addZeroLastfor_arr() {
		int[] arr= {0, 2,5,6,0,8,5,0};
		
		List<Integer> zeros= new ArrayList<>();
		List<Integer> no = new ArrayList<>();
		for( int n: arr) {
			if(n==0) {
				zeros.add(n);
			}else {
				no.add(n);
			}
		}
		zeros.addAll(no);
		System.out.println(zeros);
	}
	
	static void addZeroLastfor_int1(){
		long no = 12452012501000445L;
		
		String Sno= String.valueOf(no);
		
		StringBuilder nonzeros = new StringBuilder();
		
		int zerocount =0;
		
		for(char ch: Sno.toCharArray()) {
			if(ch=='0') {
				zerocount++;
			}else {
				nonzeros.append(ch);
			}
		}
		
		StringBuilder result = nonzeros.append("0".repeat(zerocount));
		System.out.println(result);
		
//		String result2 = "0".repeat(zerocount)+ nonzeros;
//		
//		System.out.println(result2);

	}
	
	
	
	public static void main(String[] args) {
		
//		addZeroLastfor_int();
//		addZeroLastfor_arr();
		addZeroLastfor_int1();
		
	}
}
