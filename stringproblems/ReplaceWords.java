package stringproblems;

public class ReplaceWords {

	public static void main(String[] args) {
	
		 String str="krishan kumar mishra";
		 
		 StringBuilder strb=new StringBuilder();
		 for(int i=0;i<str.length();i++) {
			 
			 char chr=str.charAt(i);
			 
			 if(chr =='a'||chr=='e'||chr =='i'||chr =='o'||chr =='u') {
				 strb.append("X");
			 }else {
				 strb.append(chr);
			 }
		 }
		 
		 
		
		 System.out.println(strb.toString()); 
		 
		 
		 String str1="krishan kumar mishra";
			
		 str1=str1.replaceAll("[aeiou]","x");
		 
		 System.out.println(str1);
	}
	
	
	

}
