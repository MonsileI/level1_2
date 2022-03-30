package Today_22_03_30_kakao_level1;

import java.util.Stack;

public class no_5 {

	public static void main(String[] args) {
		
		int[][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int result = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<moves.length;i++) {
			
			int crap = moves[i]-1;
			
			for(int j=0;j<board.length;j++) {
				
				if(board[j][crap]!=0) {
					
					if(stack.isEmpty()) {
						stack.add(board[j][crap]);
						board[j][crap] = 0;
						break;
						
					}else {
						if(stack.peek()==board[j][crap]){
							stack.pop();
							board[j][crap] = 0;
							result++;
							break;
						}else {
							stack.add(board[j][crap]);
							board[j][crap] = 0;
							break;
						}
					}
					
				}
				
			}
			
		}
		
		System.out.println(result *2);
		
	}
}
