package Today_22_04_21;

import java.util.ArrayList;
import java.util.HashSet;

public class test {
	
	static HashSet<String> set = new HashSet<>();

	public static void main(String[] args) {
		
		int[][]temp = {{1,0,0},{1,0,1},{1,0,1},{1,0,0},{1,1,1},{0,0,1}};
		
		int r = 2;
		
		int range = temp[0].length;
		
		int[]arr = new int[range];
		
		boolean[]check = new boolean[temp[0].length];
		
		dfs(arr,check,r,range);
		int answer =0;
		String answerS = "";
		for(int i=0;i<temp.length;i++) {
			String s = "";
			int count = 0;
			for(int j=0;j<temp[0].length;j++) {
				s += temp[i][j];
			}
			
			for(String str : set){
				if(str.equals(s)) {
					count++;
				}
			}
			
			if(count>answer) {
				answer = count;
				answerS = s;
			}
		}
		
		
		System.out.println(set);
		
		System.out.println(answerS);
	}
	
	public static void dfs(int[]arr,boolean[]check,int r,int range) {
		
		if(r==0) {
			String s = "";
			for(int i=0;i<arr.length;i++) {
				s += arr[i];
			}
			set.add(s);
			return;
		}
		
		for(int i=0;i<range;i++) {
			if(!check[i]) {
				check[i] = true;
				arr[i] = 1;
				dfs(arr,check,r-1,range);
				arr[i]=0;
				check[i] = false;
			}
		}
		
		
		
	}
	

}
