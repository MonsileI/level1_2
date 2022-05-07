package Today_22_05_06;

import java.util.*;

public class test {
	
	static int answer = 0;
	static int goal = 0;
	static int [] arr= {1};
	static int num = 0;
	

	//2 = 6 3
	//3 = 14 7
	//4 = 30 15
	//5 = 62 31
	//6 = 126 63 
	//7 = 254  127
	
	public static void main(String[] args) {
	
	dfs(0,0);
	
	

	
	}
	private static void dfs(int depth, int sum) {
		
		System.out.println(num++);

		if(depth == arr.length) {
			if(goal == sum) {
				answer++;
			}
			return;
		}
		
		int next = depth+1;
		
		dfs(next,sum+arr[depth]);
		dfs(next,sum-arr[depth]);
		
	}
	
}