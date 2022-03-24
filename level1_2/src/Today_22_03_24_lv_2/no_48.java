package Today_22_03_24_lv_2;

public class no_48 {

	public static void main(String[] args) {
		
		int n = 78;
		
		int answer = n+1;
		
		int count = Integer.bitCount(n);
		
		int temp = 0;
		
		while(true) {
			
			temp = Integer.bitCount(answer);
			
			if(temp == count) break;
			
			answer++;
		}
		
		
		System.out.println(answer);
		
	}
}
