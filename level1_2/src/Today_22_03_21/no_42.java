package Today_22_03_21;

import java.util.Arrays;

public class no_42 {

	public static void main(String[] args) {
		
		int n = 118372;
		String s = String.valueOf(n);
		String answer = "";
		String a[] = s.split("");
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			answer+= a[s.length()-i-1];
			
			
		}
		
		System.out.println(answer);
		
	
	}
}
