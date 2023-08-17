package stringproblems;

public class ReverseString {

	public static void main(String[] args) {
		///first 
		String str = "awesome patineve";
	     char ch;
		String revstr = "";

		for (int i =0;i<str.length();i++) {
			ch=str.charAt(i);
			revstr=ch+revstr;
			System.out.println(revstr);
			
		}
		System.out.println("Reverse string : " + revstr);
		
		
		//second 
		StringBuilder str1=new StringBuilder("krishan");
		System.out.println(str1.reverse());
		
		//third
		String str2="table tenis";
		
		char[] temp=str2.toCharArray();
		
		int left=0;
		int right=temp.length-1;
		
		for(left=0;left<right;left++) {
			
			char  temporary=temp[left];
			temp[left]=temp[right];
			temp[right]=temporary;
			
		}
		
		for(char c:temp) {
			System.out.print(c);
		}
		
		//or 
		System.out.println("===========");
		String srtp=new String(temp);
		
		System.out.println(srtp);

	}
	
	
	
	

}
