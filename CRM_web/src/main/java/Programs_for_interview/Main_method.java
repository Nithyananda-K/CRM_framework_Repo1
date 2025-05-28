package Programs_for_interview;

import java.util.Scanner;

class Employe{
	
	String Name= "mahesh";
	int sal= 60000;
	
	Employe(){
		String Name= "sudeep";
		System.out.println(this.Name);    // access the global variable 
		System.out.println(Name);         // access the local variable 
		System.out.println(sal);
	}
	
	String add() {
		return "adding";
	}
		
	String askName() {
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter your name ");
		String Name = sc.next();
		return Name;
	}
}

 public class Main_method {
	 
	public static void main(String[] args) {
		Employe obj = new Employe();
		
		String candName= obj.askName();
		System.out.println(candName);
	}
}

 

 
 
 
 
 