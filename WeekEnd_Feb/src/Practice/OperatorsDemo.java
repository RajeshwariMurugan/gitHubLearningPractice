package Practice;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorsDemo obj = new OperatorsDemo();
//		obj.arithematicOperator();
//		obj.arithematicOperator(5, 6);
//
//		obj.incrementOperator();
//		obj.decrementOperator(8);
//
//		obj.assignmentOperator();

//		obj.relationalOperator();
//		obj.relationalOperator(5, 7);

		//obj.logicalOperator();
		
		System.out.println(obj instanceof OperatorsDemo);

	}

	public void logicalOperator() {
       System.out.println(!false);
	}

	public void relationalOperator(int a, int b) {
		System.out.println(a >= b);
	}

	public void relationalOperator() {
		System.out.println(2 == 4); //
	}

	public void assignmentOperator() {
		int a = 10;
		int b = 20;
		a += b;
		System.out.println(a);
	}

	public void decrementOperator(int age) {
		System.out.println(--age);
		System.out.println(age--);

	}

	public void incrementOperator() {
		int age = 20;
		// System.out.println(age++); //20
		System.out.println(++age); // 21
	}

	public void arithematicOperator() {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	public void arithematicOperator(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
