package Today_22_04_08;

public class test {
	
	static boolean[]visited;
	static int[] pick;
	static int count;

	public static void main(String[] args) {
	
	int n = 4;
	
	visited = new boolean[n];
	pick = new int[n];
	
	count = 0;
	
	backTracking(0,n);
	
	System.out.println(count);
		
	}
	public static void backTracking(int idx,int n) {
		
		if(n==idx) {
			count++;
			return;
		}
		
		
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				pick[idx] = i;
				if(check(idx, n)) backTracking(idx+i,n);
				visited[i] = false;
				
			}
		}
		
	}
	public static boolean check(int idx, int n) {
		
		for(int i=0;i<idx;i++) {
			if(pick[idx]==pick[i]) return false;
			if(Math.abs(pick[idx]-pick[i])==Math.abs(idx-i)) return false;
		}
		
		return true;
	}
}