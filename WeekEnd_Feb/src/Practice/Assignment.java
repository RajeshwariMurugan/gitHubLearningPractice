package Practice;

public class Assignment {

	public static void main(String[] args) {
		Assignment obj=new Assignment();
		
		int a=30;
		int b=40;
	
//		System.out.println(1>5 || 100 >20);
		
		
		System.out.println(!(a>b));
		
		System.out.println(++a);
		System.out.println(a);
		
		
		
//		obj.add();
//		obj.add(5,7);
	}
	
	public void add() {
		int a=4;
		int b=5;
		int c=a+b;
		a+=b;   // a=a+b;
		System.out.println(c);
		System.out.println(a);
	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
}
