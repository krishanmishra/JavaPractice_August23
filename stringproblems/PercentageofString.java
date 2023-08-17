package stringproblems;

public class PercentageofString {
	
	public static int percentageletter(String s,char letter) {
		int counter=0;
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(c==letter) {
				counter++;
			}
			
		}
		double percentage=((double)counter/(double)s.length())*100;	
		
		return (int) Math.floor(percentage);
	}

	public static void main(String[] args) {
		System.out.println(percentageletter("foobar",'o'));
        System.out.println(percentageletter("jjjj",'k'));
        System.out.println(percentageletter("a",'a'));

	}

}
