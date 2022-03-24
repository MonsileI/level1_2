package Today_22_03_24_lv_2;

import java.util.ArrayList;

public class no_46 {

	public static void main(String[] args) {
		
		String msg = "KAKAO";
		
		ArrayList<String> dic = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0;i<alpha.length();i++) dic.add(String.valueOf(alpha.charAt(i)));
		
		
		int idx = 1;
		
		//할 일 : 일단 첫번째 사전에 들어갈 단어를 뽑아준다
		String now = ""+msg.charAt(0);
		
		while(idx<=msg.length()) {
			
			if(idx==msg.length()) {
				answer.add(dic.indexOf(now)+1);
				break;
			}
			
			
			char next = msg.charAt(idx);
			String newOne = now+next;
			
			if(dic.contains(newOne)) {
				now = newOne;
				idx++;
				continue;
			}
			
			dic.add(newOne);
			answer.add(dic.indexOf(now)+1);
			idx++;
			now = ""+next;
			
			
		}
		
		System.out.println(answer);
	}
	
}
