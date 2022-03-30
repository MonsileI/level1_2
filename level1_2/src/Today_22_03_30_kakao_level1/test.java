package Today_22_03_30_kakao_level1;


import java.util.*;

public class test {

	public static void main(String[] args) throws Exception {
	

		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		int[][]visited = new int[maps.length][maps[0].length];
		
		dfs(maps,visited,0,0);
		
		answer = visited[maps.length-1][maps.length-1];
		if(answer==0)answer=-1;
		System.out.println(answer+1);
	}
	
	static void dfs(int[][]maps,int[][]visited,int x,int y) {
		
		
		
		int []dx = {1,0,-1,0};
		int []dy = {0,1,0,-1};
		
		for(int i=0;i<4;i++) {
			
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx<0||ny<0||maps.length<=nx||maps[0].length<=ny) continue;
			
			if(maps[nx][ny]==1 && visited[nx][ny]==0) {
				visited[nx][ny] = visited[x][y] + 1;
				dfs(maps,visited,nx,ny);
			}
			
		}
		
		
		
	}
	
}
