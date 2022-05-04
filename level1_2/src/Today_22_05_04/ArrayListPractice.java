package Today_22_05_04;

import java.util.*;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		int idx = 0;
		int a = arr.remove(idx);
		int b = arr.remove(idx);
		arr.add(idx,a+b);
		System.out.println(arr.get(idx));
	}

}
