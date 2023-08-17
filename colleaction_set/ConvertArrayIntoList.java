package colleaction_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayIntoList {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 };
		String[] str= {"aa","bb","cc","dd"};
//
//		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//
//		int[] array = { 1, 2, 3, 4, 5 };

		// Convert array to ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList(str));

		// Print the ArrayList
		System.out.println(arrayList);
	}

}
