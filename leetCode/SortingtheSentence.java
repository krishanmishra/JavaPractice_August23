package leetCode;

import java.util.Arrays;

public class SortingtheSentence {

	public static String sortSentence(String sentences) {
		String[] words=sentences.split(" ");
		//System.out.println(Arrays.toString(words));
		//System.out.println(words.length);
		String[] wordswithcorrectposition=new String[words.length];
		for(String word:words) {
			
		//	System.out.println(word.length()-1);
			
			char c=word.charAt(word.length()-1);
			
			int index=Character.getNumericValue(c);
			
			wordswithcorrectposition[index-1]=word.substring(0,word.length()-1);
			
		//	System.out.println(wordswithcorrectposition[index-1]);
		}
		
		return String.join(" ", wordswithcorrectposition);
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println(sortSentence("is2 sentence4 this1 a3"));	
	System.out.println(sortSentence("Myself2 Me1 I4 and3"));
	}	

	

}
