package Today_22_03_23_lv_2;

import java.util.ArrayList;

public class no_17 {

	public static void main(String[] args) {
		
		//Straight Left Right
		
		//쏘는 방향의 시작점(a)와 도착점(b)이 일치할 경우 끝(쏘는 시점 전에서 끝)
		
		String [] grid = {"SL","LR"};
		
		String[][]board = new String[grid[0].length()][grid.length];
		
		for(int i=0;i<grid.length;i++) {
			
			for(int j=0;j<grid[0].length();j++) {
				
				board[i][j] = String.valueOf(grid[i].charAt(j));
				
			}
			
		}
		int a = Integer.MIN_VALUE;
		int b = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		
	
		
	}
}
