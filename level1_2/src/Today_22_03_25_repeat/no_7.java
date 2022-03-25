package Today_22_03_25_repeat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class no_7 {
	
	public static void main(String[] args) {
		
		int[]progresses = {93,30,55};
		int []speeds = {1,30,5};
		
		Queue<Integer>que = new LinkedList<Integer>();
		int count;
		for(int i=0;i<progresses.length;i++) {
			count = 0;
			while(progresses[i]<100) {
				
				progresses[i] += speeds[i];
				count++;
			}
			
			que.add(count);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(!que.isEmpty()) {
			
			count = 1;
			int now = que.poll();
			while(!que.isEmpty()&&now>=que.peek()) {
				que.poll();
				count++;
				
			}
			
			
			list.add(count);
			
		}
		
		int[]answer = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		for(int i : answer) System.out.println(i);
		
		
	}

}
