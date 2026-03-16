package Practice;

public class Aus {
	
    String salary ;             // instance variable
    static float population;  

	public static void main(String[] args) {
		
		
		String myName="Chennai";
		System.out.println("Name: "+myName);
		System.out.println("DOB: 08.20.1997");
		System.out.println("Time: 3.05 AM");
		System.out.println("Place: Chennai");
		System.out.println("Father Name : Karunakaran");
		System.out.println("Mother Name :Raji");
		
		
		Aus a=new Aus();   // object create
		a.add();
		System.out.println(a.salary);
		
		System.out.println(population);
		
	}
	
	
	public static void add() {
		int age=23;  // local variables
		System.out.println("Sunday");
		System.out.println(age);
		
	}

}
