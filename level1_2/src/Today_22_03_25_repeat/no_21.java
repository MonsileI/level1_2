package Today_22_03_25_repeat;

public class no_21 {
	
	public static void main(String[] args) {
		
		//맨처음엔 AAAA이렇게 찍혀있음
		//CCAAAACC
		
		String name = "JEROEN";
		
		int answer = 0;
		int LR = name.length() - 1;
	
		for(int i=0;i<name.length();i++) {
			
			answer += Math.min(name.charAt(i) - 'A' , 'Z' - name.charAt(i));
			
			int index = i + 1;
			
			while(index<name.length() &&name.charAt(index)=='A') {
				index++;
			}
			
			LR = Math.min(LR, i*2 + name.length() - index);
			
			LR = Math.min(LR, (name.length()-index)*2+i);
			
		}
		
		System.out.println(answer + LR);
	}

}
