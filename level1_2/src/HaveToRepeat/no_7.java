package HaveToRepeat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class no_7 {
	
	public static void main(String[] args) {
		
		int[]progresses = {93,30,55};
		int []speeds = {1,30,5};
		
		Queue<Integer> que = new LinkedList<>();
	
		
		for(int i=0;i<progresses.length;i++) {
			
			int count = 0;
			while(progresses[i]<100) {
				
				progresses[i] += speeds[i];
				
				count++;
			}
			
			que.add(count);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(!que.isEmpty()) {
			
			
			int count = 1;
			int check = que.poll();
			
			
			while(!que.isEmpty()&&check>que.peek()) {
				
				count++;
				que.poll();
			}
			
			list.add(count);
			
			
		}
		
		int[]answer = new int[list.size()];
		for(int i =0;i<answer.length;i++) {
			answer[i] = list.get(i);
		}
		
		for(int i : answer) System.out.println(i);
		
		
	}

}
