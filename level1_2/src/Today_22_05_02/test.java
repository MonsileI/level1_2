package Today_22_05_02;

public class test {

	public static void main(String[] args) {
		
		int n =2; //진법
		int t = 4; //구해야 할 숫자 갯수
		int m = 2; //인원
		int p = 1; //내 순서
		
		String s = "0";
		
		int num = t*m;
		int round = 1;
		
		while(num>0) {
			
		
			String temp = "";
			int tempInt = round;
			while(tempInt > 0) {
			    int quotient = tempInt / n;
			    int remainder = tempInt % n;
			    temp = remainder + temp;
			    tempInt = quotient;
			}
			
			round++;
			num -= temp.length();
			s = s+temp;
			
		}
		String answer = "";
		
				
		for(int i=0;i<s.length();i++) {
			
			if(i%m==p-1) {
				answer += s.charAt(i);
			};
			
			
		}
		System.out.println(answer);
	}
	
}
