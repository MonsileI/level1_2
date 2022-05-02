package Today_22_05_02;

public class expressionNumber {

	public static void main(String[] args) {
		
		int n = 15;
		int answer = 0;
		int start = 1;
		
		
		while(start<=n) {
			
			int sum = 0;
			int temp = start;
			while(sum<n) {
				sum += temp;
				temp++;
			}
			
			if(sum==n) {
				answer++;
				start ++;
			}
			else if(sum>n) {
				start++;
			}
			
		}
		
		System.out.println(answer);
		
	}
}
