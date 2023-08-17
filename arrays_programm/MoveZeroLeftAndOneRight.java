package arrays_programm;

//Move all 0'sto to the left and 1's to the right of the array. array int[] a = [0,1,1,0,0,1,0] output a = [0,0,0,0,1,1,1]

public class MoveZeroLeftAndOneRight {
	
	public static int[] movezeroleftAndoneright(int[] sum) {
		
		int left=0;
		int right=sum.length-1;
		
		while(left<=right) {
			
			while(left<=right&& sum[left]==0) {
				left++;
			}
			
			while(left<=right &&sum[right]==1) {
				right--;
				
			}
			
			while(left<right) {
				int temp=sum[left];
				sum[left]=sum[right];
				sum[right]=temp;
				left++;
				right--;
			}

		}		
		
		return sum;
	}

	public static void main(String[] args) {
		
		int[] a= {1,0,0,1};
		
		int[] arr=movezeroleftAndoneright(a);
		
		for(int a1:arr) {
			//System.out.println("sort with 0's and 1's: "+a1);
			System.out.print(a1);
		}

	}

}
