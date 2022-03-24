package Today_22_03_24_lv_2;

import java.util.Arrays;
import java.util.Collections;

public class no_53 {
	
	public static void main(String[] args) {
		
		int [] A = {1,4,2};
		int [] B = {5,4,4};
		Integer [] BB = new Integer [B.length];
		for(int i=0;i<B.length;i++) {
			
			BB[i] = B[i];
			
		}
		Arrays.sort(A);
		Arrays.sort(BB, Collections.reverseOrder());
	
		
		
		int answer = 0;
		
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
			System.out.print(B[i]);
			answer += A[i] * BB[i];
			
			System.out.println();
		}
		
		
		System.out.println(answer);
		
		
	}

}
