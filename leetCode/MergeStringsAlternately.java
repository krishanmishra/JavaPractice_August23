package leetCode;

public class MergeStringsAlternately {
	
	public static String mergeStringalternatively(String str1,String str2) {
		StringBuilder result=new StringBuilder();
		
		int minLength=Math.min(str1.length(), str2.length());
		for(int i=0;i<minLength;i++) {
			result.append(str1.charAt(i)).append(str2.charAt(i));
		}
						
		if(str1.length()>minLength) {
			 	result.append(str1.substring(minLength));
		}
		
		if(str2.length()>minLength) {
		 	result.append(str2.substring(minLength));
	}
		
		return result.toString();
	}
	
	

	public static void main(String[] args) {
		System.out.println(mergeStringalternatively("abc", "xyz"));
		System.out.println(mergeStringalternatively("abcd", "xy"));
		System.out.println(mergeStringalternatively("abcd", "xyz123"));
		System.out.println(mergeStringalternatively("", "xyz123"));
		System.out.println(mergeStringalternatively("abcd", ""));
		System.out.println(mergeStringalternatively("A", ""));
		System.out.println(mergeStringalternatively("A", "1"));
		System.out.println("abc".substring(2)); //minimum length logic
		
		System.out.println("abc".substring(3)+" nothing print");
		
		System.out.println("abc".substring(0,2));
		System.out.println("abc".substring(0,3));
	}

}
