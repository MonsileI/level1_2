package Today_22_03_22_lv_2;

public class no_10 {
	
	public static void main(String[] args) {
		
		int rows = 6;
		int columns = 6;
		int [][]queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int [] result = new int[queries.length];
		int [][] board = new int[columns][rows];
		int [][] temp = new int[columns][rows];
		int num = 1;
		
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				board[i][j] = num;
				temp[i][j] = num;
				num++;
			}
		}
		
		for(int i=0;i<queries.length;i++) {
			
			//x는 세로값, y는 가로값 
			int x1 = queries[i][0]-1;
			int y1 = queries[i][1]-1;
			int x2 = queries[i][2]-1;
			int y2 = queries[i][3]-1;
			
	        int minNum = Integer.MAX_VALUE;
	        //최소값 먼저 찾기
	        for(int j=x1;j<=x2;j++) {
	        	if(board[j][y1]<minNum) minNum = board[j][y1];
	        	if(board[j][y2]<minNum) minNum = board[j][y2];
	        }
	        for(int j=y1;j<=y2;j++) {
	        	if(board[x1][j]<minNum) minNum = board[x1][j];
	        	if(board[x2][j]<minNum) minNum = board[x2][j];
	        }
	        
	        //회전하자
	        //맨 위
	       for(int j=y1+1;j<=y2;j++) {
	    	   temp[x1][j] = board[x1][j-1];
	    	   
	       }
	       //맨 아래
	       for(int j=y1;j<=y2-1;j++) {
	    	   
	    	   temp[x2][j] = board[x2][j+1];
	       }
	        
	       //왼쪽
	       for(int j=x1;j<=x2-1;j++) {
	    	   temp[j][y1] = board[j+1][y1];
	       }
	       //오른쪽
	       for(int j=x1+1;j<=x2;j++) {
	    	   temp[j][y2] = board[j-1][y2];
	       }
	       
	       for(int j=0;j<columns;j++) {
	    	   for(int k=0;k<rows;k++) {
	    		   board[j][k] = temp[j][k];
	    	   }
	       }
	        
			result[i] = minNum;
			
		}
		
		for(int i : result) System.out.println(i);
	}
	
	
}
