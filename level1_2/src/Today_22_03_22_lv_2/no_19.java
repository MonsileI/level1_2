package Today_22_03_22_lv_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class no_19 {
	
	public static void main(String[] args) {
		
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		 int count = 1;
		for(int i : priorities) pq.offer(i);
	

			for(int i=0;i<priorities.length;i++) {
				
				if(pq.peek()==priorities[i]) {
					
					if(location==i) {
						answer = count;
						break;
					}else {
						count++;
						pq.poll();
					}
				}
				
			}
		
			
		
		System.out.println(answer);
		
	}

}
