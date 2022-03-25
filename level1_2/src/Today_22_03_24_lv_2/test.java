package Today_22_03_24_lv_2;

import java.util.*;

public class test {
	
	public static void main(String[] args) {
	
	int n = 10;
	
	int [][] board = new int[n][];
	
	for(int i=0;i<n;i++) board[i] = new int[i+1];
		
	int x = -1;
	int y = 0;
	int num = 1;
	
	for(int i=0;i<board.length;i++) {
		for(int j=i;j<board.length;j++) {
			if(i%3==0) {
				x++;
			}else if(i%3==1) {
				y++;
			}else {
				x--;
				y--;
			}
			board[x][y] = num;
			num++;
		}
		
	}
	
	int sum=0;
	for(int i=n;i>=0;i--) {
		sum += i;
	}
	int[]answer = new int[sum];
	System.out.println(sum);
	int idx = 0;
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[i].length;j++) {
			answer[idx++] = board[i][j];
			}
	}
	
	for(int i : answer) System.out.println(i);
	
	}
}
