package Today_22_03_21;

public class no_43 {
	
	public static void main(String[] args) {
		
		int n = 3;
		long answer = 0;
		long sqrt = (long) Math.sqrt(n);
		
		if(n==Math.pow(sqrt, 2)) {
			answer = (long)Math.pow(sqrt+1,2);
		}else {
			answer = -1;
		}
		
		
		System.out.println(answer);
		
		
	}

}
