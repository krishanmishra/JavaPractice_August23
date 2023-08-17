package arrays_programm;

import java.util.Arrays;

public class ShuffleArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(shuffle(new int[]{2,3,4,5,6,7},3)));
		System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1},4)));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] resultArray=new int[nums.length];
		for(int i=0;i<n;i++) {
			resultArray[i*2]=nums[i];
			resultArray[(i*2)+1]=nums[i+n];
		}
	
		return resultArray;
	}

}
