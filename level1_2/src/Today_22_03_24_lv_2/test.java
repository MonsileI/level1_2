package Today_22_03_24_lv_2;

import java.util.*;

public class test {
	
	public static void main(String[] args) {
		
	String str1 = "aa1+aa2";
	String str2 = "AAAA12"; 
	
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	
	int answer = 0;
	
	
	ArrayList<String>list1 = new ArrayList<String>();
	ArrayList<String>list2 = new ArrayList<String>();
	
	for(int i=1;i<str1.length();i++) {
		if('a'<=str1.charAt(i-1) && 'z'>=str1.charAt(i-1)&&
		   'a'<=str1.charAt(i) && 'z'>=str1.charAt(i)		
		) list1.add(""+str1.charAt(i-1)+str1.charAt(i));
				
	}
	for(int i=1;i<str2.length();i++) {
		
		if('a'<=str2.charAt(i-1) && 'z'>=str2.charAt(i-1)&&
		   'a'<=str2.charAt(i) && 'z'>=str2.charAt(i)		
		) list2.add(""+str2.charAt(i-1)+str2.charAt(i));
		
	}
		
	double hap = 0;
	double gyo = 0;
	
	
	for(int i=0;i<list1.size();i++) {
		String temp = list1.get(i);
		for(int j=0;j<list2.size();j++) {
			if(temp.equals(list2.get(j))) gyo++;
		}
	}
	
	hap = list1.size() + list2.size() - gyo;
	
	double test = gyo / hap *65536;
	System.out.println(test);
	
	answer = (int)test;
	
	System.out.println(answer);
	
		
	}
}
