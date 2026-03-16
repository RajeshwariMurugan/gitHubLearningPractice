package java_4PM;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExceptionHandling {
	static int count=1;

	public static void main(String[] args) throws NullPointerException {
         
		

	}

	private static void method() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ENter");
		int n = s.nextInt();
		try {
			System.out.println(4 / n);
			System.out.println("try");
		} catch (ArithmeticException e) {
			System.out.println("the number was error");
			if(count++<=3) {
				method();
			}
			else {
				System.out.println("please wait ");
			}
		} catch (NullPointerException e) {
           System.out.println("1234567890"+e.getMessage());
		} finally {
			System.out.println("finally");
		}

	}
}
