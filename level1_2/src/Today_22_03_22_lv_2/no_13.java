package Today_22_03_22_lv_2;

import java.util.ArrayList;
import java.util.List;

public class no_13 {
	
	public static void main(String[] args) {
		
		
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";
		double answer = 0;
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	
		List<String> arr1 = new ArrayList<>();
		List<String> arr2 = new ArrayList<>();
	    ArrayList<String> gong = new ArrayList<>();
        ArrayList<String> hab = new ArrayList<>();
		
		for(int i=0;i<str1.length()-1;i++) {
			char first = str1.charAt(i);
			char second = str1.charAt(i+1);
			if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
				arr1.add(first +""+second);
				}
			}
		for(int i=0;i<str2.length()-1;i++) {
			char first = str2.charAt(i);
			char second = str2.charAt(i+1);
			if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
				arr2.add(first +""+second);
			}
		}
		
		double gyo = 0;
		double hap = arr1.size()+arr2.size();
		
		System.out.println(arr1);
		System.out.println(arr2);
		for(int i=0;i<arr1.size();i++) {
			String check = arr1.get(i);
			for(int j=0;j<arr2.size();j++) {
				if(check.equals(arr2.get(j))) {
					gyo++;
					break;
				}
			}
		}
		
		for(String s : arr1) {
			if(arr2.remove(s)) {
				gong.add(s);
			}
			hab.add(s);
		}
		
		double gong_len = gong.size();
		double hab_len = hab.size();
		if(hab_len==0) {
			answer = 65536;
			int result = (int)answer;
			System.out.println(result);
		}else {
			
			answer = gong_len / hab_len * 65536;
			int result = (int)answer;
			System.out.println(result);
		}
		
		
		
		
	
	}

}
