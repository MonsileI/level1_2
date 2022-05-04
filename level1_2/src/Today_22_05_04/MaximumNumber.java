package Today_22_05_04;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class MaximumNumber {

	static char op[] = {'+','-','*'};
    static long answer = 0;
    static boolean visit[] = new boolean[3];
    static ArrayList<Long> arrList = new ArrayList<>();
    static ArrayList<Character> opList = new ArrayList<>();
	
    
    public static void main(String[] args) {
	
    	String expression = "100-200*300-500+20";	
    	String num = "";
    	
    	for(int i=0;i<expression.length();i++) {
    		char ch = expression.charAt(i);
    		
    		if(ch>='0'&&ch<='9') {
    			num += ch;
    			continue;
    		}
    		
    		arrList.add(Long.parseLong(num));
    		num="";
    		opList.add(ch);
    		
    	}
    	arrList.add(Long.parseLong(num));
    	
    	dfs(0,new char[3]);
    	
    	System.out.println(answer);
    	
    }
    static void dfs(int count,char[]p) {
    	
    	
    	if(count==3) {
    		ArrayList<Long> numList = new ArrayList<>(arrList);
    		ArrayList<Character> chList = new ArrayList<>(opList);
    		for(int i=0;i<p.length;i++) {
    			for(int j=0;j<chList.size();j++) {
    				if(p[i]==chList.get(j)) {
    					long a = calc(numList.remove(j),numList.remove(j),p[i]);
    					numList.add(j,a);
    					chList.remove(j);
    					j--;
    				}
    			}
    		}
    		answer = Math.max(answer, Math.abs(numList.get(0)));
    		return;
    	}
    	
    	for(int i=0;i<3;i++) {
    		if(!visit[i]) {
    			visit[i] = true;
    			p[count] = op[i];
    			dfs(count+1,p);
    			visit[i] = false;
    		}
    	}
    	
    }
    static Long calc(long a,long b,char ch) {
    	if(ch=='+')return a+b;
    	else if(ch=='-')return a-b;
    	else return a*b;
    }
    
}