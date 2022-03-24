package Today_22_03_24_lv_2;



public class no_45 {
	
	public static void main(String[] args) {
	
	
		int [][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int answer = 0;
		
		int c = board.length;
		int r = board[0].length;
		
		int[][]temp = new int[c][r];
		
		for(int i=0;i<c;i++) temp[i][0] = board[i][0];
		for(int i=0;i<r;i++) temp[0][i] = board[0][i];
			
		
		for(int i=1;i<c;i++) {
			for(int j=1;j<r;j++) {
				if(board[i][j]==1) {
					temp[i][j] = Math.min(Math.min(board[i-1][j-1], board[i][j-1]), board[i-1][j-1])+1;
					answer = Math.max(answer, temp[i][j]);
				}
				
				
			}
		}
		
		System.out.println((int)Math.pow(answer, answer));
	}

}
