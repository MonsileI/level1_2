package Today_22_05_02;

public class combinationPractice {

	
	public static void main(String[] args) {
		
		
		int[]arr = {1,2,3};
		
		int n = arr.length;
		
		boolean[]isVisited = new boolean[n];
	
		for(int i=1;i<=n;i++) {
			System.out.println(n+"개 중에"+i+"개 뽑기");
			combination(arr,isVisited,0,n,i);
		}
	}
	static void combination(int[]arr,boolean[]isVisited,int start,int n,int r) {
		if(r==0) {
			print(arr,isVisited,n);
			return;
		}
		for(int i=start;i<n;i++) {
			isVisited[i] = true;
			combination(arr,isVisited,i+1,n,r-1);
			isVisited[i] = false;
		}
	}
	
	static void print(int[]arr,boolean[]isVisited,int n) {
		for(int i=0;i<n;i++) {
			if(isVisited[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
}
