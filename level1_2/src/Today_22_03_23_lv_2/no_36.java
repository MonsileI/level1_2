package Today_22_03_23_lv_2;

public class no_36 {
	
	public static void main(String[] args) {
		
		int n = 4;
		
	
		int[][]board = new int[n][];
		
		for(int i=0;i<board.length;i++) {
			board[i] = new int[i+1];
		}
		
		int col = -1;
		int row = 0;
		int idx = 1;
		
		for(int i=0;i<board.length;i++) {
			for(int j=i;j<board.length;j++) {
				if(i%3==0) {
					col++;
				}else if(i%3==1) {
					row++;
				}else {
					col--;
					row--;
				}
				board[col][row] = idx;
				idx++;
			}			
			
		}
		
		int sum = 0;
		int k = 0;
		for(int i=n;i>=0;i--) {
			sum += i;
		}
		
		int[]answer = new int[sum];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				
				answer[k++] = board[i][j];
				
				
			}
		}
		
		for(int i : answer) System.out.println(i);
	}			

}
