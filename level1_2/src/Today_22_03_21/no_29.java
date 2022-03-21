package Today_22_03_21;

public class no_29 {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int answer = 0;
		
		if(min==max) answer = min;
		else {
			for(int i=min;i<=max;i++) {
				answer += i;
			}
			
		}
		
		System.out.println(answer);
	}

}
