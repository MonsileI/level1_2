package Today_22_03_23_lv_2;

import java.util.Arrays;

public class no_30 {
	
	public static void main(String[] args) {
		
		int[]citations = {3,0,6,1,5};
		int answer = citations.length;
		
		Arrays.sort(citations);
		//0 1 3 5 6
		
		//몇편 이상이 몇개가 최대가 되는 거
		
		//1 2 3 4 5 9 10 11
		//
		
		for(int i=0;i<citations.length;i++) {
			
			int now = citations[i];
			int max = citations.length -(i+1);
			
			if(now<max) {
				answer --;
				
			}else {
				break;
			}
			
			
			
		}
		
		System.out.println(answer);
		
	}

}
