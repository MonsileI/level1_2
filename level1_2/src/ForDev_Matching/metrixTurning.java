package ForDev_Matching;

public class metrixTurning {
	
	public static void main(String[] args) {
		
		int columns = 97;
		int rows = 100;
		
		int[][]queries = {{1,1,100,97}};
		
		int []answer = new int[queries.length];
		
		int[][]board = new int[rows][columns];
		int[][]temp = new int[rows][columns];
		
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
			
			int col1 = queries[i][0]-1;
			int col2 = queries[i][2]-1;
			int row1 = queries[i][1]-1;
			int row2 = queries[i][3]-1;
			
			for(int j=col1;j<=col2;j++) {
				if(board[j][row1]<min) min = board[j][row1];
				if(board[j][row2]<min) min = board[j][row2];
			}
			for(int j=row1;j<=row2;j++) {
				if(board[col1][j]<min) min = board[col1][j];
				if(board[col2][j]<min) min = board[col2][j];
			}
			
			//위
			for(int j=row1+1;j<=row2;j++) {
				temp[col1][j] = board[col1][j-1];
			}
			//아래
			for(int j=row1;j<=row2-1;j++) {
				temp[col2][j] = board[col2][j+1];
			}
			//왼
			for(int j=col1;j<=col2-1;j++) {
				temp[j][row1] = board[j+1][row1];
			}
			//오
			for(int j=col1+1;j<=col2;j++) {
				temp[j][row2] = board[j-1][row2];
			}
			
			for(int j=0;j<rows;j++) {
				for(int k=0;k<columns;k++) {
					board[j][k] = temp[j][k];
				}
			}
			
			
			answer[i] = min;
		}
		
		for(int i : answer)System.out.println(i);
	}

}
