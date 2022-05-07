package Today_22_05_06;

public class bfsTest {

	public static void main(String[] args) {
		
		int n = 4;
		int[][] computers = {{1, 1, 0, 1}, {1, 1, 0, 0},{0, 0, 1, 1}, {1, 0, 1, 1}};
		int ans = 0;
		 
		for(int i=0;i<n;i++) {
	            if(computers[i][i]==1) {
	                ans+=1;
	                bfs(i,computers);
	            }
	    }
		  
		System.out.println(ans);
		
		}
	
	  static void bfs(int i, int[][] computers) {
	        computers[i][i]=0;
	        for(int j=0;j<computers.length;j++) {
	            if(computers[i][j]==1) {
	                computers[i][j]=0;
	                bfs(j,computers);
	            }
	        }
	  }
	  
}