package Practice;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operators op = new Operators();
		op.add(5,6);
		op.add(3, 7);
		op.multiple();
		op.multiple(2,4,5);
		
	
	}
     
	private void multiple(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
		
	}

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void multiple(int a,int b) {
		System.out.println(a*b);
	}
	
	
	
	
	public void multiple() {
		int a = 20;
		int b = 10;
		System.out.println(a * b);
		

	}
    
	public void division() {
		int a = 20;
		int b = 10;
		System.out.println(a * b);

	}
}
