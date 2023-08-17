package arrays_programm;

public class MoveZeroAndOne {
	
	
	//this is for move zero to right
//	public static int[] movezeroAndone(int[] nums) {
//		
//		int n=nums.length;
//		
//		int count=0;
//		
//		for(int i=0;i<n;i++) 
//		{
//			if(nums[i]!=0) 
//			{
//				nums[count++]=nums[i];
//			}
//		}
//		 while (count < n)
//	            nums[count++] = 0;
//	    
//		return nums;
//		
//	}

	
	
public static int[] movezeroAndone1(int[] num) {
	
	int left=0;
	int right=num.length-1;
	
	while(left<=right) {
		while(left <=right &&num[left]==0) {
			left++;
			System.out.print("left:"+left);
		}
		
		while(left<=right  && num[right]==1 ) {
			right--;
		System.out.print("right"+right);
		}
		
		//swap
		if(left<right) {
			System.out.println("number:"+num[left]);
			int temp=num[left];
			num[left]=num[right];
			System.out.println(num[left]);
			num[right]=temp;
			System.out.println(num[right]);
			left++;
			System.out.println(left);
			right--;
			System.out.println(right);
		}
		
	}
	
	
	return num;
}
	public static void main(String[] args) {
		int[] a= {0,0,0,0};
//		int[] nn=movezeroAndone(a);
		int[] nn1=movezeroAndone1(a);
		
		for(int t:nn1) {
			System.out.print(t);
		}
		

	}

}
