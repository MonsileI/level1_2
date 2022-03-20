package Today_22_03_20;

import java.util.ArrayList;

public class no_10 {
	
	public static void main(String[] args) {
		
		int[]nums = {1,2,7,6,4};
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			
			if(i+2>nums.length) break;
			
			for(int j=i+1;j<nums.length;j++) {
				
				for(int h=j+1;h<nums.length;h++) {
					

					list.add(h+j+i);
					
				}
			}
			
		}
	
		for(Integer i : list) {
			int count = 2;
			result++;
			while(count < i) {
				if(i % count == 0) {
					result--;
					break;
				}
				count++;
			}
			
		}
		
		System.out.println(result);
	}

}
