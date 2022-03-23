package Today_22_03_23_lv_2;

import java.util.Arrays;
import java.util.Comparator;

public class no_19 {
	
	public static int max = 0;

	public static void main(String[] args) {
		
		int [] numbers = {3, 30, 34, 5, 9};
		
		String answer = "";

		String [] temp = new String[numbers.length];
		//chartAt(0)이 제일 큰걸 앞에 붙여
		
		for(int i =0;i<numbers.length;i++) temp[i] = String.valueOf(numbers[i]);
		
		 Arrays.sort(temp,new Comparator<String>(){
	           
	            @Override
	            public int compare(String o1, String o2){
	            	//문자열을 더했을때 뭐가 더 크냐 (당연히 앞자리가 큰게 크겠지?)
	                return ((o2+o1).compareTo(o1+o2));
	            }
	            
	        });
		 
		 for(String y : temp) System.out.println(y);
		
	}
	
}
