package Today_22_03_21;

public class no_45 {

	public static void main(String[] args) {
		
		int n = 2;
		int m = 5;
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		while(min>0) {
			int r = max%min;
			max = min;
			min = r;
		}
		
		int []answer = {n*m/max,max};
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}
