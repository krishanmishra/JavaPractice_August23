package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortPeople {
	
	public static String[] sortPeople(String names[],int[] heights) {
		HashMap<Integer,String> mapping=new HashMap<>();
		
		for(int i=0;i<names.length;i++) {
			mapping.put(heights[i], names[i]);
		}
		
//		System.out.println(mapping);
//		System.out.println(mapping.keySet());
//		System.out.println(mapping.values());
		
		
		ArrayList<Integer> allheight=new ArrayList<>(mapping.keySet());
		//System.out.println(allheight);
	
		
		allheight.sort(Collections.reverseOrder());
		//System.out.println(allheight);
		
		String[] result=new String[names.length];
		for(int j=0;j<allheight.size();j++) {
			int key=allheight.get(j);
			//System.out.println(key);
			
			result[j]=mapping.get(allheight.get(j));
			
			//System.out.println(result[j]);
		}
		
		return result;
		
		
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(sortPeople(new String[]{"Mary","john","kim"},new int[]{180,165,170})));
		System.out.println(Arrays.toString(sortPeople(new String[]{"alice","Bob","Bob"},new int[]{155,185,150})));
		

	}

	
}
