package Today_22_03_18;

public class no_5 {
	
	public static void main(String[] args) {
	
		int[]numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		String result = "";
		
		int r = 12;
		int l = 10;
	
		for(int now : numbers) {
			
			if(now==0) now=11;
			
			if(now%3==1) {
				result += "L";
				l = now;		
				
			}else if(now%3==0) {
				result += "R";
				r = now;
			}else {
				
				int tempL = Math.abs(now-l)%3 + Math.abs(now-l)/3;
				int tempR = Math.abs(now-r)%3 + Math.abs(now-r)/3;
				
				if(tempR==tempL) {
					
					if(hand.equals("right")) {
						result += "R";
						r = now;
					}else {
						result += "L";
						l = now;
					}
					
					
				}else if(!(tempR>tempL)) {
					result += "R";
					r = now;
				}else{
					result += "L";
					l = now;
				}
				
				
			}
		}
		
		System.out.println(result);
	}
}
