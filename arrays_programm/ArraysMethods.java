package arrays_programm;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		String[] arr= {"krishan","kumar","mishra"};
		System.out.println(arr);
		
		for(String a:arr) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2= {{1,2},{3,4}};
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
		
		String[] arr3= {"Krishan","Ram","Mohan","Papa"};
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr3,1,4)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr3,1,9)));
		
		System.out.println(Arrays.toString(Arrays.copyOf(arr3,1)));
		
		Arrays.fill(arr3, "krish");
		System.out.println(Arrays.toString(arr3));
		
		
		
		}
	}


