package Today_22_03_20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class no_13 {
	
	public static void main(String[] args) {
		
		int[]answer = {1,2,3,4,5};
		
		int[]pos1 = {1,2,3,4,5};
		int[]pos2 = {2,1,2,3,2,4,2,5};
		int[]pos3 = {3,3,1,1,2,2,4,4,5,5};
		
		int fir = 0;
		int sec = 0;
		int thi = 0;
		
		for(int i=0;i<answer.length;i++) {
			
			if(answer[i]==pos1[i%5]) {
				fir++;
			}
			if(answer[i]==pos2[i%8]) {
				sec++;
			}
			if(answer[i]==pos3[i%10]) {
				thi++;
			}

		}
		
		int check = Math.max(Math.max(fir, sec), thi);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(check==fir) list.add(1);
		if(check==sec) list.add(2);
		if(check==thi) list.add(3);
		
		int[] result = new int[list.size()];
		
		for(int i=0;i<list.size();i++) result[i] = list.get(i);
		
		for(int i : result) System.out.println(i);
	}

}
