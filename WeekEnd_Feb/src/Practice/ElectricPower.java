package Practice;

public class ElectricPower {
	
	   double salary=50000.00;       //instance 
	   static long population;
	
	   

	public static void main(String[] args) {
           
		ElectricPower ep= new ElectricPower();  // object create
		System.out.println(ep.salary);
		System.out.println(population);
		ep.voltz();
		Operators op=new Operators();
		op.add(4, 4);
	//	op.multiple(1, 2,4);

	}
	
	public void voltz() {
		String name="raji";    // local
		int age=30;
		
		System.out.println(name+ age);
	}

}
