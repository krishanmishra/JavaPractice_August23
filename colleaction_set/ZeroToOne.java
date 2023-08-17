package colleaction_set;

import java.util.ArrayList;
import java.util.List;

public class ZeroToOne {
	
	public static List<Integer> sortOnewithzero(List<Integer> arr){
		
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		
		for(int i=0;i<arr.size();i++) {
			
			if(arr.get(i)==0) {
				list1.add(arr.get(i));
			}else {
				list2.add(arr.get(i));
			}
		}
		
	  list1.addAll(list2);
	  
	  return list1;
		
	}

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();		
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);list.add(1);
		list.add(0);
		
		System.out.println("Before the list: "+list);
		
		List<Integer> ll= sortOnewithzero(list);
		
		System.out.println("After the traver the list: "+ll);
			

	}

}
