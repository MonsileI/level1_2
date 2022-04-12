package Today_22_04_08;

import java.util.Arrays;

public class greedy_Camera {
	
	public static void main(String[] args) {
		
		int[][]routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
		
		int answer = 0;
		
		Arrays.sort(routes,(a,b)->Integer.compare(a[1],b[1]));
		
		int min = Integer.MIN_VALUE;
		for(int[]route : routes) {
			if(min < route[0]) {
				min = route[1];
				++answer;
			}
		}
		
		System.out.println(answer);
	}

}
