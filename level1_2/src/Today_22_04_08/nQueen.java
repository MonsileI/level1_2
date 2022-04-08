package Today_22_04_08;

public class nQueen {
	
	static int[]rows;
	static int[]cols;
	static int count;
	
	public static void main(String[] args) {
		
		int n = 4;
		
		cols = new int[n];
		rows = new int[n];	
		count = 0;
		
		dp(n,0);
		
		System.out.println(count);
	}
	
	public static void dp(int n, int idx) {
		
		
		if(n==idx) {
			count++;
			return;
		}
		
		for(int i=0;i<n;i++) {
			
			if(rows[i]==0) {
				rows[i] = 1;
				cols[idx] = i;
				if(check(n,idx)) dp(n,idx+1);
				rows[i] = 0;
			}
		}
		
	}

	public static boolean check(int n,int idx) {
		
		for(int i=0;i<idx;i++) {
			if(i==idx) return false;
			else if(Math.abs(cols[idx]-cols[i]) == Math.abs(idx-i)) return false;
		}
		
		return true;
	}
}
