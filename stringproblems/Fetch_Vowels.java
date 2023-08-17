package stringproblems;

import java.util.stream.Collectors;

public class Fetch_Vowels {

	public static void main(String[] args) {
		
		String str="krishan kumar mishra";
		
		String vowels=str.chars().filter(c->"aeiouAEIOU".indexOf(c)>=0)
				.mapToObj(c->String.valueOf((char)c))
						.collect(Collectors.joining());
				
		System.out.println(vowels);		
		
		
		String vowelss="aeiouAEIOU";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			System.out.println("character is : "+ch+"  "+vowelss.indexOf(ch));
			
			if(vowelss.indexOf(ch)!=-1) {
				
				result.append(ch);
			}
			
	
			
		}
		System.out.println(result);
	}

}
