package HaveToRepeat;

import java.util.*;

public class backjoon {

	public static void main(String[] args) {
	
		int n = 9;
		int m = 13;
		int [] a = {5,12,7,10,9,1,2,3,11};
		
		
		int start = 0;
		int end = n-1;
		int result = 0;
		
		Arrays.sort(a);
		int sum = 0;
		while(start<end) {
			sum = a[start] + a[end];
			
			if(sum==m) result++;
			
			if(sum<=m) start++;
			else end--;
			
		}
		
		
		System.out.println(result);
		
		
	}
}
