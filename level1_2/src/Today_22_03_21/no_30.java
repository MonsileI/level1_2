package Today_22_03_21;

import java.util.ArrayList;
import java.util.Collections;


public class no_30 {

	public static void main(String[] args) {
		
		String[] strings = {"sun", "bed", "car"};
		String[]answer = {};
		int n = 1;
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<strings.length;i++) {
			
			list.add(strings[i].charAt(n)+" "+strings[i]);
			
		}
		
		Collections.sort(list);
		
		answer = new String [list.size()];
		
		for(int i=0;i<strings.length;i++) {
			
			String[]check = list.get(i).split(" ");
			
			answer[i] = check[1];
			
		}
		
		
		for(String s : answer) System.out.println(s);
	}
}
