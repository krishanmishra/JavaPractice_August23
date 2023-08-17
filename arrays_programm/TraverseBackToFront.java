package arrays_programm;

public class TraverseBackToFront {

	public static void main(String[] args) {
		int[] arr= {12,10,24,25,26};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
