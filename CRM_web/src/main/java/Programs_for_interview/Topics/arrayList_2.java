package Programs_for_interview.Topics;
import java.util.ArrayList;

public class arrayList_2 {

	
	public static void getList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("guva");
		list.add("banana");
		list.add("Mango");
		
		System.out.println(list.get(1));
	}
	
	
	public static void main(String[] args) {
		getList();

	}

}
