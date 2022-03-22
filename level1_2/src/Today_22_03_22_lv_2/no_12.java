package Today_22_03_22_lv_2;

import java.util.*;

public class no_12 {

	public static void main(String[] args) {

		String p = "(()())()";
		String answer = "";
		
		if(p.equals("")) answer="";
		
		Stack<Character>stack = new Stack<>();
		
		int right=0 ,left =0;
		int idx = 0;
		for(int i=0;i<p.length();i++) {
			
			if(p.charAt(i)=='(') {
				stack.add('(');
				right++;
			}else {
				if(!stack.isEmpty()) {
					stack.pop();
					left++;
				}else {
					stack.add(')');
					left++;
				}
			}
			if(right==left) {
			    idx = i+1;
				break;
			}
			
		}
		
		if(idx!=p.length()) {
			String u = p.substring(0,idx);
			String v = p.substring(idx,p.length());
			
		}
				
		
	
				
		
		
		
		
		
		
	}
}