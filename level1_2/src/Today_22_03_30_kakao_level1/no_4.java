package Today_22_03_30_kakao_level1;

public class no_4 {
	
	public static void main(String[] args) {
		
	
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		String result = "";
		int right = 12;
		int left = 10;
		for(int i=0;i<numbers.length;i++) {
			
			int now = numbers[i];
			
			if(now==0) now=11;
			
			if(now%3==1) {
				result += "L";
				left = now;
			}else if(now%3==0) {
				result += "R";
				right = now;
			}else {
				
				int rightTemp = Math.abs(now-right); 
				int leftTemp = Math.abs(now-left);
				
				int right2 = (rightTemp/3)+(rightTemp%3);
				int left2 = (leftTemp/3)+(leftTemp%3);
				
				if(right2<left2) {
					result += "R";
					right = now;
				}else if(right2>left2) {
					result += "L";
					left = now;
				}else {
					
					if(hand.equals("right")) {
						result += "R";
						right = now;
					}else {
						result += "L";
						left = now;
					}
					
					
				}
				

				
			}
			

			
		}
		
		
		System.out.println(result);
		
		
	}

}
