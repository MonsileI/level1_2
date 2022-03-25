package HaveToRepeat;

public class no_1 {

	public static void main(String[] args) {
	
		String s = "aabbaccc";
		
		int answer = Integer.MAX_VALUE;
		
		for(int i=1;i<=s.length()/2;i++) {
			
			int count = 1;
			String temp = "";
			String str = "";
			
			for(int j=0;j<s.length()/i;j++) {
				
				if(temp.equals(s.substring(i*j,(i*j)+i))) {
					count++;
					continue;
				}
				
				if(count>1) {
					str += count + temp;
					count = 1;
				}else {
					str += temp;
				}
				
				temp=s.substring(i*j,(i*j)+i);
			}
			
			
			if(count>1) {
				str += count + temp;
				count = 1;
			}else {
				str += temp;
			}
			
			if(s.length()%i != 0) {
				
				str+= s.substring(s.length()-s.length()%i,s.length());
			}
			
			answer = answer > str.length() ? str.length() : answer;
		}
		System.out.println(answer);
	}
}
