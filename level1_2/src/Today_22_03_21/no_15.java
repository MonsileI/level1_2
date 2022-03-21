package Today_22_03_21;

import java.util.HashSet;

public class no_15 {
	
	public static void main(String[] args) {
		
		int[]nums = {3,1,2,3};
		int result = 0;
		
	
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : nums) set.add(i);
		
		if(set.size()>nums.length/2) result = nums.length/2;
		else result = set.size();
		
		System.out.println(result);
		
	}

}
