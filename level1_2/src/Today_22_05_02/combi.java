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
		
	
		System.out.println("====================");
		
		
		dfs("",arr,visited);
		
		System.out.println("총" + num + "개");
		
	}
	
	static void dfs(String now,int []arr,boolean[]visited) {
		
		System.out.println(now);
		num++;
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String next = now +String.valueOf(arr[i])+" ";
				dfs(next,arr,visited);
				visited[i] = false;
			}
		}
		
		
	}
	
	static void combi(int[]arr,boolean[]visited,int n,int start,int r) {
		
		if(r==0) {
			print(visited,arr,n);
			return;
		}
		for(int i=start;i<arr.length;i++) {
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
