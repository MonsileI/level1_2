package Today_22_03_21;

import java.util.Arrays;

public class no_18 {
	
	public static void main(String[] args) {
		
		
		int []d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		
		Arrays.sort(d);
		
		
		for(int i : d) {
			
			budget -= i;
			answer++;
			if(budget<0) break;
		}
		
		System.out.println(answer-1);
	
	}

}
