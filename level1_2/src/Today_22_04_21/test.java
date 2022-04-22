package Today_22_04_21;

import java.util.ArrayList;
import java.util.HashSet;

public class test {
	
	static HashSet<String> set = new HashSet<>();

	public static void main(String[] args) {
		
		int[][]temp = {{1,0,0},{1,0,1},{1,0,1},{1,0,0},{1,1,1},{0,0,1},{0,0,0},{1,0,0},{1,1,1},{1,1,1}};
		
		int r = 2;
		
		int range = temp[0].length;
		
		int[]arr = new int[range];
		
		boolean[]check = new boolean[temp[0].length];
		
		dfs(arr,check,r,range);
		int answer =0;
		String answerS = "";
		
		String[]tempS = new String[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			String s = "";
			for(int j=0;j<temp[0].length;j++) {
				s += String.valueOf(temp[i][j]);	
			}
			tempS[i] = s;
			
			System.out.println(tempS[i]);
		}
		
		
		
		
		for(String str : set) {
			
			int count = 0;
			
			for(int i=0;i<tempS.length;i++) {
				
				if(str.equals(tempS[i])) {
					count++;
					continue;
				}else {
					for(int j=0;j<tempS[i].length();j++) {
						if(str.charAt(j)=='0'&&tempS[i].charAt(j)=='1') {
							count--;
							break;
						}
					}
					
					count++;
				}
				
			}
			
				
			answer = Math.max(count, answer);
			
			
		}
		
		System.out.println(answer);
		
		
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
