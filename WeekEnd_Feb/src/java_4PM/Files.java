package java_4PM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void readFile() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Raji\\Desktop\\Oranium Tech\\WeekEnd_Feb\\src\\java_4PM\\hello.txt"); // file may not exist
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();

		} catch (IOException e) {
			System.out.println("wrong file");
		}

	}

}
