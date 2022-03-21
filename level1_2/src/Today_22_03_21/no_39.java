package Today_22_03_21;

public class no_39 {
	
	public static void main(String[] args) {
	
		String s = "try hello world";
		
		String answer = "";
		
		String[]check = s.split(" ");
		
		for(int i=0;i<check.length;i++) {
			
			String now = check[i];
			
			for(int j=0;j<now.length();j++) {
				
				if(j%2==0) {
					
					answer += String.valueOf(now.charAt(j)).toUpperCase();
				}else {
					answer += String.valueOf(now.charAt(j)).toLowerCase();
				}
				
			}
			
			answer += " ";
			
		}
		if(check.length>2) {
			
			System.out.println(answer.substring(0,answer.length()-1));
		}else {
			
			System.out.println(answer);
		}
		
	}

}
