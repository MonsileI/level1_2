package Today_22_03_23_lv_2;

public class no_34 {

	public static int answer = 0;
	
	public static void main(String[] args) {
		
		int[][]dungeons = {{80,20},{50,40},{30,10}};
		int k = 80;
		
		boolean[]check = new boolean[dungeons.length];
		
		dfs(dungeons,k,check,0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int[][]dungeons,int k,boolean[]check,int cnt) {
		
		for(int i=0;i<dungeons.length;i++) {
			
			if(!check[i]&&dungeons[i][0]<=k) {
				
				check[i] = true;
				int next = k - dungeons[i][1];
				dfs(dungeons,next,check,cnt+1);
				check[i] = false;
			}
			
			
		}
		
		answer = Math.max(answer, cnt);
		
	}
}
