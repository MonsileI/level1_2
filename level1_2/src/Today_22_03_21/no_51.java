package Today_22_03_21;

public class no_51 {
	
	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		long [] answer = new long[n];
	
		for(int i=1;i<=n;i++) {
			
			answer[i-1] = x*i;
			
			
		}
		
		
		for(long i : answer) System.out.println(i);
		
		
	}

}
