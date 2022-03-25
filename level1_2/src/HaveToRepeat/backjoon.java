package HaveToRepeat;

import java.util.Arrays;

import java.util.Scanner;

public class backjoon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) a[i] = scan.nextInt();
 		int answer = scan.nextInt();
 		
 		Arrays.sort(a);
 		
 		int sum = 0;
 		int end = n-1;
 		int start = 0;
 		int result = 0;
 		while(start<end) {
 			sum = a[start] + a[end];
 			if(sum==answer)result++;
 			
 			if(sum<=answer) start++;
 			else end--;
 			
 		}
 		
 		
 		
		System.out.println(result);
	}
}
