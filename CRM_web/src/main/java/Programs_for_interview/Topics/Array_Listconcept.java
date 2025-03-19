package Programs_for_interview.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_Listconcept {

	public static void arrlistbasic() {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("guva");
		fruits.add("grapes");
		System.out.println(fruits); // [apple, mango, guva, grapes]

		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));

		// replace the item
		fruits.set(0, "jackfruit");
		fruits.remove(2); // remove(0); removeFirst(); removeLast(); removeAll(fruits);
		System.out.println(fruits);
	}
	
	public static void add_arrList1() {
		ArrayList<String> items = new ArrayList<>();
		items.addAll(Arrays.asList("Item1", "Item2","Item3", "Item4"));
		System.out.println(items);
	}
	
	public static void add_arrList2() {
		ArrayList<String> values = new ArrayList<>();
		Collections.addAll(values, "Value1", "Value2","Value3", "Value4");
		System.out.println(values);
	}
	
	public static void adding_byForLoopAraylist() {
		ArrayList<String> names= new ArrayList<>();
		
		String[] arr= {"nithya","madhu", "sudeep", "darshan"};
		for(int i =0; i<arr.length; i++) {
			names.add(arr[i]);
		}
		System.out.println(names);
	}
	
	public static void adding_byForeachLoopAraylist() {
		ArrayList<String> films= new ArrayList<>();
		
		String[] kannada= {"OM","KGF", "DK", "RX"};
		for(String movie: kannada) {
			films.add(movie);
		}
		System.out.println(films);
	}
	
	public static void main(String[] args) {
//		arrlistbasic();
		add_arrList1();
//		add_arrList2();
//		adding_byForLoopAraylist();
//		adding_byForeachLoopAraylist();
	}
}                                            




