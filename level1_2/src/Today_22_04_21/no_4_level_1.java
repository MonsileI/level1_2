package Today_22_04_21;

public class no_4_level_1 {

	
	public static void main(String[] args) {
		
		int []numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String answer = "";
		
		int r = 12;
		int l = 10;
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]==0) numbers[i] = 11;
			
			
			if(numbers[i]%3==0) {
				answer += "R";
				r = numbers[i];
				
			}else if(numbers[i]%3==1) {
				answer += "L";
				l = numbers[i];
			}else {
				
				int rangeR = Math.abs(numbers[i]-r)/3+Math.abs(numbers[i]-r)%3;
				int rangeL = Math.abs(numbers[i]-l)/3+Math.abs(numbers[i]-l)%3;
				
				if(rangeR>rangeL) {
					answer += "L";
					l = numbers[i];
				}else if(rangeR<rangeL) {
					answer += "R";
					r = numbers[i];
				}else {
					if(hand.equals("right")) {
						answer += "R";
						r = numbers[i];
					}else {
						answer += "L";
						l = numbers[i];
					}
				}
				
				
			}
			
		}
		
		System.out.println(answer);
	}
}
