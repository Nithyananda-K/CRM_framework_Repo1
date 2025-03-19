package Programs_for_interview.Topics;

class base_model {

	public void nexon() {

		System.out.println("Base model nexon");
	}
}

class Top_model extends base_model {

	public void nexon() {

		super.nexon();
		System.out.println("Top model nexon");
	}
}

public class overriding {

	public static void main(String[] args) {
	
	   base_model bm	= new Top_model();
	   bm.nexon(); 
	}

}
