package Practice;

public class ControlStatments {

	public static void main(String[] args) {

		System.out.println("Hello");

		int num = -5;

		if (num > 0) {
			System.out.println(num + " is positive");
		} else {
			System.out.println(num + "is negative");
		}

		System.out.println(num > 0 ? num + " is positive" : num + " is negative");

		int age = 2;

		if (age >= 18) {
			System.out.println(age + " age Eligible");
		} else {
			System.out.println(age + " Not eligible");
		}

		System.out.println(age >= 18 ? age + "you are eligible for vote" : age + "you are not eligible");

		int marks = 90;

		if (marks > 90) {
			System.out.println("grade A");
		} else if (marks > 70) {
			System.out.println("grade B");
		} else if (marks >= 35) {
			System.out.println("grade C");
		} else {
			System.out.println("fail");
		}

	}
}
