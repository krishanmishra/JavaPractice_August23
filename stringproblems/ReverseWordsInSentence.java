package stringproblems;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String sentences="Given a sentence as a string";
		
		String[] words=sentences.split(" ");
		
		StringBuilder reverse=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			reverse.append(words[i]);
			
			if(i>0) {
				reverse.append(" ");
			}
		}		
		
		System.out.println(reverse.toString());
	}

}
