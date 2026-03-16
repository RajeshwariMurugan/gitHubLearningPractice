package Practice;

import java.util.Arrays;

public class Array_Feb {
	public static void main(String[] args) {

		Array_Feb f = new Array_Feb();
		
		
		//f.trail();
		byte arr[]= {5,10,15,20};
		
		
		
		for(byte i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);

		}
		
       for(byte a:arr ) {
    	   System.out.println(a);
       }
	
       System.out.println(arr);
       
		
		
		
		
		
		
		
		
		//System.out.println(arr);

	}


	private void trail() {
		// TODO Auto-generated method stub
		String arr[] = { "Apple", "bat", "cat", "dog", "egg" };
		// System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String[] arr1 = { "Apple", "bat", "cat", "dog", "egg" };
		// System.out.println(arr);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		String[] arr2 = new String[] { "Apple", "bat", "cat", "dog", "egg" };
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] arr3 = new String[6];
		arr3[4] = "elephant";

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		for (String a : arr2) {
			System.out.println(a);
			System.out.println("+++++++++++++++");
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr2[i]);
		}

		System.out.println(Arrays.toString(arr2));
		
		

	}
}
