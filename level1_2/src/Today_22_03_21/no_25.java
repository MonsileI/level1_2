package Today_22_03_21;

public class no_25 {
	
	public static void main(String[] args) {
	
		String s = "abcde";
		String answer = "";
		int check = s.length()/2;
		if(s.length()%2==0) {
			
		
			answer = s.substring(check-1, check+1);
			
			
		}else{
			answer = s.substring(check, check+1);
		
		}
		
		System.out.println(answer);
		
		
	}

}
