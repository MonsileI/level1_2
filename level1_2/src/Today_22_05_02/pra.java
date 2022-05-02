package Today_22_05_02;

public class pra {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		int n = arr.length;
		boolean[]visited = new boolean[n];
		
		for(int i=1;i<=n;i++) {
			System.out.println(n+"개 중에 " + i + "개 뽑기");
			combination(arr,visited,i,0,n);
		}
		
		
		
		
		
		
	}
	static void combination(int[]arr,boolean[]visited,int r,int start,int n) {
		if(r==0) {
			print(arr,visited,n);
			return;
		}
		for(int i=start;i<n;i++) {
			visited[i] = true;
			combination(arr,visited,r-1,i+1,n);
			visited[i] = false;
		}
		
	}
	static void print(int [] arr,boolean[]visited,int n) {
		for(int i=0;i<n;i++) {
			
			if(visited[i]) {
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
	}
}
