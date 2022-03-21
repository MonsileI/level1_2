package Today_22_03_21;

public class no_31 {
	
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		boolean answer = false;
		
		s = s.toLowerCase();
		int check = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='p') check++;
			else if(s.charAt(i)=='y')check--;
			
		}
		
		if(check==0) answer=true;
		
		System.out.println(answer);
		
	}

}
