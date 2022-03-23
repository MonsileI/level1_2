package Today_22_03_23_lv_2;

import java.util.LinkedList;
import java.util.Queue;

public class no_23 {
	
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) {
	
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
	
		int[][] visited = new int[maps.length][maps[0].length];
		
		bfs(maps,visited);
		
		answer = visited[maps.length-1][maps[0].length-1];
		
		if(answer==0) answer=-1;
		
		
		System.out.println(answer);
		
		
	}
	
	public static void bfs(int[][]maps,int[][]visited) {
		
		//bfs는 초기화를 여기서 한다
		int x = 0;
		int y = 0;
		int[]current = {x,y};
		visited[x][y] = 1;
		
		Queue<int[]>que = new LinkedList<int[]>();
		
		que.add(current);
		
		while(!que.isEmpty()) {
			
			int [] now = que.poll();
			
			int cx = now[0];
			int cy = now[1];
			
			for(int d=0;d<4;d++) {
				
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				if(nx<0||ny<0||maps.length-1<nx||maps[0].length-1<ny) continue;
				
				
				if(visited[nx][ny]==0&&maps[nx][ny]==1) {
					visited[nx][ny] = visited[cx][cy] + 1;
					que.add(new int[] {nx,ny});
					
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
	}
}