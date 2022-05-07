package Today_22_05_02;

import java.util.ArrayList;

public class combi {
	
	static int num = 0;
	
	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		
		int n = arr.length;
		
		boolean[]visited = new boolean[n];
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(n+"중에" + i+"개 조합");
			combi(arr,visited,n,0,i);
		}
		
	
	
		
	}
	

		
	
	
	static void combi(int[]arr,boolean[]visited,int n,int start,int r) {
		
		if(r==0) {
			print(visited,arr,n);
			return;
		}
		for(int i=start;i<n;i++) {
			visited[i] = true;
			combi(arr,visited,n,i+1,r-1);
			visited[i] = false;
			
			
		}
		
	}
	static void print(boolean[]visited,int[]arr,int n) {
		
		for(int i=0;i<n;i++) {
			if(visited[i]) System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
}
