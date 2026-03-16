package Practice;

public class JumpingStatements {

	public static void main(String[] args) {

		JumpingStatements j = new JumpingStatements();
//		j.switchDemo();
//		j.forLoopDemo();
//		j.whileDemo();
		
//		j.doWhile();
		
		
		for(int i=1;i<10;i++) {
			if(i%2==0) {  
				continue;
			}
			else {
				System.out.println(i);
			}
			
			
			System.out.println(i+"loops end");
		}
		
		
	
		
		

	}

	private void doWhile() {
		
		int i=1;
		do {
			System.out.println("java");
			i++;
		}while(i<=5);
		
	}

	public void whileDemo() {
		int i=1;
		while(i<=5) {
			System.out.println("sowmiya");
			i++;
		}
	}

	public void forLoopDemo() {
		String name = "Sowmiya";
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + name);
		}
		
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}

	}

	public void switchDemo() {

		int age = 15;

		switch (age) {

		case 2:
			System.out.println("child");
			break;
		case 15:
			System.out.println("adult");
			break;
		case 1:
			System.out.println("baby");
			break;

		default:
			System.out.println("no");
			break;

		}
	}
}
