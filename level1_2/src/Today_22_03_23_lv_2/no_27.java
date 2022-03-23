package Today_22_03_23_lv_2;


public class no_27 {

	public static void main(String[] args) {
		
		String s = "[](){}";
		
		int answer = 0;
		
		for(int i=0;i<s.length();i++) {
			
			
			String temp = s.substring(i,s.length());
		
			
			temp += s.substring(0,i);
			
			
			
			boolean flag = true;
			int open = 0;
			for(int j=0;j<temp.length();j++) {
				
				if(temp.charAt(j)=='('||
				   temp.charAt(j)=='{'||
				   temp.charAt(j)=='['
						) open++;
				else open--;
					
			
				if(open==-1) {
					flag = false;
					break;
				}
			}
			if(open!=0) flag=false;
			
			if(flag) answer++;			
		}
		System.out.println(answer);
		
	}
}
