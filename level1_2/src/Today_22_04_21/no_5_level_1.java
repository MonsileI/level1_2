package Today_22_04_21;

import java.util.Stack;

public class no_5_level_1 {
	
	public static void main(String[] args) {
		
		
		int[][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int [] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		Stack<Integer>stack = new Stack<>();
		
		
		for(int i=0;i<moves.length;i++) {
			
			int mov = moves[i]-1;
			
			for(int j=0;j<board.length;j++) {
				
				if(board[j][mov]!=0) {
					if(!stack.isEmpty()&&stack.peek()==board[j][mov]) {
						stack.pop();
						answer++;
						board[j][mov] = 0;
						break;
					}else {
						stack.add(board[j][mov]);
						board[j][mov] = 0;
						break;
					}
				}
			
				
			}
			
		}
		
		System.out.println(answer*2);
	}

}
