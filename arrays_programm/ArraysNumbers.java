package arrays_programm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysNumbers {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(between(1,5)));
	}

	private static int[] between(int a, int b) {
		
		return IntStream.rangeClosed(a, b).toArray();
	}

}
