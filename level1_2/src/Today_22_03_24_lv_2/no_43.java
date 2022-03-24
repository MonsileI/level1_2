package Today_22_03_24_lv_2;

import java.util.HashSet;

public class no_43 {

	public static void main(String[] args) {
		
	String dirs = "ULURRDLLU";	
	
	HashSet<String> set = new HashSet<String>();
	
	int nowX =0;
	int nowY =0;
	
	for(int i=0;i<dirs.length();i++) {
		
		int nextX = nowX;
		int nextY = nowY;
		String road = "";
		if(dirs.charAt(i)=='U') {
			nextY++;
			road += nextX;
			road += nextY;
			road += nowX;
			road += nowY;
			
			
		}else if(dirs.charAt(i)=='D') {
			nextY--;
			road += nextX;
			road += nextY;
			road += nowX;
			road += nowY;
		}else if(dirs.charAt(i)=='L') {
			nextX--;
			road += nextX;
			road += nextY;
			road += nowX;
			road += nowY;
		}else if(dirs.charAt(i)=='R') {
			nextX++;
			road += nextX;
			road += nextY;
			road += nowX;
			road += nowY;
		}
		
		
		if(nextX<-5||nextY<-5||5<nextX||5<nextY) continue;
	
		
		set.add(road);
		nowX = nextX;
		nowY = nextY;
		
	}
	
	System.out.println(set.size());
	
	}
}
