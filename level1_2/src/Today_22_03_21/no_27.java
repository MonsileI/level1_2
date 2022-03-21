package Today_22_03_21;


import java.util.Stack;

public class no_27 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(stack.isEmpty()) stack.add(arr[i]);
			
			if(stack.peek()==arr[i]) {
				stack.pop();
				stack.add(arr[i]);
			}else {
				stack.add(arr[i]);
			}
			
		}
			
		int[]answer = new int[stack.size()];
		for(int i =0;i<stack.size();i++) answer[i] = stack.get(i);
	
		for(int i : answer) System.out.println(i);
		
	}

}
