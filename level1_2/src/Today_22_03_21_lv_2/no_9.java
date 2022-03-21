package Today_22_03_21_lv_2;

import java.util.Stack;

public class no_9 {

	public static void main(String[] args) {
		
		int answer = 0;
		
		String s = "cdcd";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			
			if(stack.isEmpty()) {
				stack.add(a);
			}else {
				
				if(stack.peek()==a) {
					stack.pop();
					
				}else {
					stack.add(a);
				}
				
			}
			
			
		}
		
		if(stack.isEmpty()) answer = 1;
		
		System.out.println(answer);
		
		
	}
}
