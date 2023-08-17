package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnCommonWordsFrom2Sentences {
	

	public static String[] uncommonwordsFromSentences(String str1, String str2) {
		
		HashMap<String,Integer> count=new HashMap<>();
		String combinedwords=str1+" "+str2;
		System.out.println(combinedwords);
		
		for(String word:combinedwords.split(" ")) {
			count.put(word, count.getOrDefault(word,0)+1);			
		}
		
		System.out.println(count);
		
		List<String> uncommonWords=new ArrayList<>();
		//filter no duplicate element
		for(Map.Entry<String,Integer> keyValue: count.entrySet()) {
			if(keyValue.getValue()==1) {
				uncommonWords.add(keyValue.getKey());
			}
		}
		System.out.println(uncommonWords);
		//convert List to string array
		String[] resultArray=new String[uncommonWords.size()];
		resultArray=uncommonWords.toArray(resultArray);
		
		return resultArray;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(uncommonwordsFromSentences("this apple is sweet","this apple is sour")));
		
		System.out.println("==========================================");
		System.out.println(Arrays.toString(uncommonwordsFromSentences("Banana Banana","apple")));
	}


}
