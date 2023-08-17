package stringproblems;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String input = "Hello World";

		input = input.toLowerCase();
		int[] counts1 = countVC(input);
		System.out.println("Vowels are: "+counts1[0]);
		System.out.println("Consonent are: "+counts1[1]);

	}

	public static int[] countVC(String input) {
		int vowels = 0;
		int consonent = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonent++;
				}
			}			
		}
		
		int[] counts = { vowels, consonent };
		return counts;
		
	}

}
