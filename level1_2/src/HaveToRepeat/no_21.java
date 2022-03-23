package HaveToRepeat;

public class no_21 {
	
	public static void main(String[] args) {
		
		//맨처음엔 AAAA이렇게 찍혀있음
		//CCAAAACC
		
		String name = "JEROEN";
		
		int answer = 0;
		int LR = name.length() - 1;
		
		for(int i=0;i<name.length();i++) {
			
			char c = name.charAt(i);
			
			answer += Math.min(c - 'A','Z' - c);
			
			//좌우 동작 비교
			//다음 요소부터 연속된 A문자열 탐색
			int indexA = i + 1;
			while(indexA < name.length() && name.charAt(indexA) == 'A') {
				indexA++;
			}
			
			
			LR = Math.min(LR, i*2+name.length() - indexA);
			
			
		}
		
		
		
	}

}
