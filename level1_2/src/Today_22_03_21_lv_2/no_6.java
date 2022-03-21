package Today_22_03_21_lv_2;

public class no_6 {

	public static void main(String[] args) {
		
		int n = 10;
		
		String answer = "";
		
		String [] check = {"1","4","2"};
		
		while(n>0) {
			
			answer += check[n%3];
			n = (n-1)/3;
			
			
			
		}
		
		System.out.println(answer);
		
	}
}
