package Today_22_03_18;

import java.util.Stack;

public class no_6 {
	
	public static void main(String[] args) {
		
		int[][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int []moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<moves.length;i++) {
			
			int move = moves[i]-1;
			
			for(int j=0;j<board.length;j++) {
				
				if(board[j][move]!=0) {
					
					if(!stack.isEmpty()) {
					
						if(stack.peek()==board[j][move]) {
							stack.pop();
							board[j][move] = 0;
							answer++;
							break;
						}else{
							stack.add(board[j][move]);	
							board[j][move] = 0;
							break;
						}
					}else{
						stack.add(board[j][move]);
						board[j][move] = 0;
						break;
					}
				}
				
			}
			
		}
		
		System.out.println(answer*2);
	}

}
