package stringproblems;

public class RemoveConsecuitveDuplicates {
	
	public static String removeConsecuitveDuplicate(String input) {
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			
		    char currentchar=input.charAt(i);
		    if(i>0 && currentchar==input.charAt(i-1)) {
		    	continue;
		    }
		    
		    result.append(currentchar);	
		}
		
		
		return result.toString();
	}
	
	

	public static void main(String[] args) {
		 String input = "aabbbcabcbb";
		 System.out.println(removeConsecuitveDuplicate(input));

	}

}
