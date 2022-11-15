package journey;

import java.util.*;

public class Arrays_Example {
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		int[] arr1 = {3, 5, 4, 1, 6, 3, 5};
		
		Arrays.sort(arr1); // 오름차순 정렬 
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		Integer[] arr2 = {3, 5, 4, 1, 6, 3, 5};
		
		Arrays.sort(arr2, Collections.reverseOrder()); // 내림차순 정렬 // arr2 int 말고 Integer로 선언 
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		Integer[] arr3 = {3, 5, 4, 1, 6, 3, 5};
		
		Arrays.sort(arr3, 1, 5); // 1부터 4까지만 오름차순 정렬 
		
		for(int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		Integer[] arr4 = {3, 5, 4, 1, 6, 3, 5};
		
		Arrays.sort(arr4, 1, 5, Collections.reverseOrder()); // 1부터 4까지만 내림차순 정렬 
		
		for(int i : arr4) {
			System.out.print(i + " ");
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////
	}
}
