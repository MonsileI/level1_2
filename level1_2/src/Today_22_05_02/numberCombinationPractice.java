package Today_22_05_02;

import java.util.*;

public class numberCombinationPractice {

	static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,5};
		int n = arr.length;
		boolean[]isVisited = new boolean[n];
		
		for(int i=1;i<=n;i++) {
			combination(arr,isVisited,3,0,n);
		}
		
		for(String str  : list) {
			System.out.println(str);
		};
	}	
	static void combination(int[]arr,boolean[]isVisited,int r,int start,int n){
		
		if(r==0) {
			check(arr,isVisited,n);
		}
		for(int i=start;i<n;i++) {
			isVisited[i] = true;
			combination(arr,isVisited,r-1,i+1,n);
			isVisited[i] = false;
		}
		
	}
	static void check(int[]arr,boolean[]isVisited,int n) {
		String s = "";
		for(int i=0;i<n;i++) {
			if(isVisited[i]) {
				s += String.valueOf(arr[i])+ " ";
			}
			
		}
		
		list.add(s);
	}
	
}
