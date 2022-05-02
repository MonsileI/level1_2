package Today_22_05_02;

public class nGame {
	
	public static void main(String[] args) {
		
		
		int n = 2; //진수
		int t = 4; //구해야될 숫자 갯수
		int m = 2; // 인원
		int p = 1; //순서
		
		int round = m*t;
		//1, 3, 5, 7
		String temp = "0";
		int num = 1;
		while(temp.length()<=round) {
			String s = "";
			
			while(num>0) {
				
				int quotient = num/n;
				int remainder = num%n;
				s = remainder + s;
				num = quotient;
						
			}
			
			temp += s;
			System.out.println(s.length()+"s length");
			round -= s.length();
			
			num++;
			
		}
		
		System.out.println(temp);
		
		
		
	}

}
