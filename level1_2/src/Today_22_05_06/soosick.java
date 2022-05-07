package Today_22_05_06;

import java.util.ArrayList;


public class soosick {
	
	static long answer = Integer.MIN_VALUE;
	static char[]op = {'*','+','-'};
	static boolean[]visited = new boolean[3];
	static ArrayList<Long> numArr = new ArrayList<>();
	static ArrayList<Character> opArr = new ArrayList<>();

	
	public static void main(String[] args) {
		
		String expression = "100-200*300-500+20";
		
		seperate(expression);
		
		opDFS(0, new char[3],visited);
		
		System.out.println(answer);
		
	}
	
	static Long change(long a, long b, char op) {
		if(op=='+') return a+b;
		else if(op=='-') return a-b;
		else return a*b;
	}
	
	static void check(char[]p) {
		ArrayList<Long>numList = new ArrayList<>(numArr);
		ArrayList<Character>opList = new ArrayList<>(opArr);
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<opList.size();j++) {
				if(p[i]==opList.get(j)) {
					long a= change(numList.remove(j),numList.remove(j),p[i]);
					numList.add(j,a);
					opList.remove(j);
					j--;
				}
				
			}
			
		}
		
		answer = Math.max(answer,Math.abs(numList.get(0)));
		
		
	}
	
	static void opDFS(int count,char[]p,boolean[]visited) {
		
		if(count==3) {
			check(p);
			return;
		}
		
		
		
		for(int i=0;i<3;i++) {
			if(!visited[i]) {
				visited[i] = true;
				p[count] = op[i];
				opDFS(count+1,p,visited);
				visited[i] = false;
			}
		}
		
		
	}
	
	static void seperate(String expression) {
		
		//"100+200*300-500+20";
		// 300 500 20
		// +  * - +
		
		String num = "";

		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			
			if(ch>='0'&&ch<='9') num += ch;
			else {
				numArr.add(Long.parseLong(num));
				opArr.add(ch);
				num="";
			}
			
		}
		
		numArr.add(Long.parseLong(num));
		
	}
	

}
