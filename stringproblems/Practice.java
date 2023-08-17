package stringproblems;

public class Practice {

	public static void main(String[] args) {
//		String inputString = "Hello World";
//	    String vowels = "aeiouAEIOU";
//	    StringBuilder result = new StringBuilder();
//	    
//	    for (int i = 0; i < inputString.length(); i++) {
//	        char ch = inputString.charAt(i);
//	        if (vowels.indexOf(ch) != -1) {
//	            result.append(ch);
//	        }
//	    }
//	    
//	    System.out.println("The vowels in the input string are: " + result.toString());
//
//	}
		int a = 1;
		int b = 4;
		int[] array = new int[b-a+1]; // create an array with enough space for all numbers between a and b
		for (int i = 0; i < array.length; i++) {
		    array[i] = a + i; // assign each element of the array to the corresponding number between a and b
		    System.out.println(array[i]);
		}
		
	}

}
