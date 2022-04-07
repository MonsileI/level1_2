package ForDev_Matching;

public class metrixTurning2 {
	
	public static void main(String[] args) {
		
		int columns = 97;
		int rows = 100;
		
		int[][]queries = {{1,1,100,97}};
		
		int[][]board = new int[rows][columns];
		int[][]temp = new int[rows][columns];
		int[]answer = new int[queries.length];
		int num = 1;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				board[i][j] = num;
				temp[i][j] = num;
				num++;
			}
		}
		
		for(int i=0;i<queries.length;i++) {
			
			int min = Integer.MAX_VALUE;
			
			int row1 = queries[i][0]-1;
			int col1 = queries[i][1]-1;
			int row2 = queries[i][2]-1;
			int col2 = queries[i][3]-1;
			
			
			for(int j=row1;j<=row2;j++) {
				if(board[j][col1] <min) min = board[j][col1];
				if(board[j][col2] <min) min = board[j][col2];
				
			}
			for(int j=col1;j<=col2;j++) {
				if(board[row1][j] <min) min = board[row1][j];
				if(board[row2][j] <min) min = board[row2][j];
				
			}
			
			for(int j=col1+1;j<=col2;j++) temp[row1][j] = board[row1][j-1];
			for(int j=col1;j<=col2-1;j++) temp[row2][j] = board[i][j+1];
			for(int j=row1+1;j<=row2-1;j++) temp[j][col2] = board[j-1][col2];
			for(int j=row1;j<=row2-1;j++) temp[j][col1] = board[j+1][col1];
			
			for(int j=0;j<rows;j++) {
				for(int k=0;k<columns;j++) {
					board[j][k] = temp[j][k];
				}
			}
			
			answer[i] = min;
			
		}
		
		for(int i : answer)System.out.println(i);
	}

}
