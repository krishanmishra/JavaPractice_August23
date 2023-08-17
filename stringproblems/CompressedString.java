package stringproblems;

public class CompressedString {

	public static String compressedString(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		
		int count=0;
		
		StringBuilder compressed=new StringBuilder();
		
		char currentchar=input.charAt(0);
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)==currentchar) {
				count++;
			}else {
				compressed.append(currentchar).append(count);				
				currentchar=input.charAt(i);
				count=1;
			}
		}
		
		
		
		
		
		return compressed.toString();
	}

	public static void main(String[] args) {

		String input = "aaabbbcccdaaa";
		System.out.println(compressedString(input));

	}

}
