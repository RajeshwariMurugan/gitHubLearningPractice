package Practice;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Java Programming";
		String str1 = "Java Programming";

		String str2 = new String("Java Programming");

		/**
		 * == and .equals();
		 * 
		 * == --> refers only memory Address .equals --> content check
		 */

		System.out.println(name == str2);
		name = "Rajeshwari";
		System.out.println(name.equals(str2));

		String s = "sawmiya";
		System.out.println(s.replaceFirst("a", "o"));

		System.out.println(s.charAt(5));
		System.out.println(s.startsWith("s"));

		System.out.println(s.contains("z"));

		StringBuilder s1 = new StringBuilder();
		s1.append("hello");
		System.out.println(s1);
		// System.out.println(s1.reverse());
		s1.insert(2, "oii");
		System.out.println(s1);

		s1.deleteCharAt(1);
		System.out.println(s1);
//		hillo
		s1.delete(1, 3);
		System.out.println(s1);
//		
		System.out.println(s1.length());

	}
}
