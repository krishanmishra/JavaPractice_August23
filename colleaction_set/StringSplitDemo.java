package colleaction_set;

import java.util.Arrays;

public class StringSplitDemo {

	public static void main(String[] args) {
		String str="krishan*kumar*Mishra";
		String[] stringarr=str.split("\\*");
		System.out.println(Arrays.toString(stringarr));

	}

}
