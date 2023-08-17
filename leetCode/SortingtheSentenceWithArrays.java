package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingtheSentenceWithArrays {

	public static String sortSentencewithArrayList(String sentences) {
		String[] words=sentences.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		List<String> wordsList=new ArrayList<>(List.of(words));		
		
		for(String word:words) {
			
			System.out.println(word.length()-1);
			
			char c=word.charAt(word.length()-1);
			System.out.println(c);			
			
			
			int index=Character.getNumericValue(c);
			System.out.println(index);
			
			wordsList.set(index-1,word.substring(0,word.length()-1));
			
			System.out.println(wordsList);
		}
		
		return String.join(" ", wordsList);
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println(sortSentencewithArrayList("is2 sentence4 this1 a3"));	
	System.out.println(sortSentencewithArrayList("Myself2 Me1 I4 and3"));
	}	

	

}
