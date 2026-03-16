package oops;

public class Test {
  
	short a=10;
	static int age=0;
	
	public static void main(String[] args) {
      
		Calc c=new Calc();
		c.add();
		c.add(4,5);
		c.add(10,20);
		
		Override o=new Override();
		o.add();
		o.add(3,5);

	}
	


}
