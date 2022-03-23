package Today_22_03_23_lv_2;

import java.util.LinkedList;
import java.util.Queue;

public class no_29 {
	
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int[]truck_weights = {7,4,5,6};
		int time = 0;
		int sum = 0;
		
		Queue<Integer> que = new LinkedList<>();
		
		
		for(int truck : truck_weights) {
			
			while(true) {
				
				if(que.isEmpty()) {
					
					que.offer(truck);
					time++;
					sum += truck;
					break;
					
					
					
				}else if(que.size()<bridge_length) {
					
					if(sum+truck<=weight) {
						que.offer(truck);
						time++;
						sum += truck;
						break;
						
					}else {
						que.offer(0);
						time++;
						
					}
					
					
				}else if(que.size()==bridge_length) {
					
					sum -= que.poll();
					
					
				}

			}
		
			
		}
		System.out.println(time + bridge_length);
		
	}

}
