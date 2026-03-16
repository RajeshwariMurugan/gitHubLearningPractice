package Practice;

import java.util.Arrays;

public class ArrayDemo {
    
	public static void main(String[] args) {
		
		  ArrayDemo arr=new ArrayDemo();
		  arr.arrayInitial();
	}
	
	public void arrayInitial() {
		int arr[]= {1,7,9,0,4,8,0};
		System.out.println(arr[5]);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int arr2[]= {1,7,9,0,4,8,0};
		
		System.out.println(Arrays.equals(arr, arr2));
		
		System.out.println(Arrays.binarySearch(arr, 7));
		
		Arrays.fill(arr, 6);
		System.out.println(Arrays.toString(arr));
		int[] copyOf = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(copyOf));
		
		int a[][]= {{0,1,2,3},{4,5,6,7,8},{9,1,2,3,4}};
		System.out.println(Arrays.deepToString(a));
		
//		0 1 2 3
//		4 5 6 7
//		9 1 2 3
		
		System.out.println(Arrays.toString(a[1]));
		
		
		System.out.println(a[1][2]);
		System.out.println(a[2][3]);
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  "); 
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
