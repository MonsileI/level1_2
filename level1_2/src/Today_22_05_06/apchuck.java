package Today_22_05_06;

public class apchuck {
	
	public static void main(String[] args) {
		
		String s = "abcabcabcabcdededededede";
		
		int answer = Integer.MAX_VALUE;
		
		for(int i=1;i<=s.length()/2;i++) {
			
				int amount = 1;
				String result = "";
				String now = "" , next ="";
				
			for(int j=0;j<=s.length()/i;j++) {
				
				int startIdx = j*i;
				int endIdx = s.length()<i*(j+1) ? s.length() : i*(j+1);
				next = s.substring(startIdx,endIdx);
				
				if(now.equals(next)) {
					amount++;
				}else {
					result += dixCheck(amount) + now;
					amount = 1;
					
				}
				
				
				now =next;
				
			}
			
			 result += dixCheck(amount) + now;
			 
			 System.out.println(result + " -> result 길이 : " + result.length());
			answer = Math.min(answer, result.length());
		}
		
		System.out.println(answer);
		
		
	}
	
	static String dixCheck(int amount) {
		
		return amount>1 ? String.valueOf(amount) : "";
		
	}

}
