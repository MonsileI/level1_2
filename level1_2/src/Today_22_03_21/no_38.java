package Today_22_03_21;

public class no_38 {
	
	public static void main(String[] args) {
		
	int n = 12;
	
	int answer = n;
	
	for(int i=1;i<=n/2;i++) if(n%i==0) answer += i;
	
	
	System.out.println(answer);
		
	}

}
