package Today_22_03_21;


import java.util.ArrayList;

public class no_28 {

	public static void main(String[] args) {
		
		int[]arr = {5,6,7,10};
		int divisor = 5;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			
			if(i%divisor==0) list.add(i);
			
		}
		
		int[]answer = new int[list.size()];
		
		for(int i = 0 ; i<list.size();i++) answer[i] = list.get(i);
		
		if(answer.length==0) {
			int[]zero = {-1};
			System.out.println(zero[0]);
		}else {
			
			for(int i : answer) System.out.println(i);
		}
		
		
	}
}
