package Today_22_03_21_lv_2;

public class no_4 {
	
	static String []member = {"A", "C", "F", "J", "M", "N", "R", "T"};
	static int answer = 0;
	
	public static void main(String[] args) {
	
		int n = 2;
		String[]data = {"N~F=0", "R~T>2"};
		boolean[]visited = new boolean[member.length];
		dfs(data,"",visited,member);
		System.out.println(answer);
		
	}
	
	public static void dfs(String[]data,String name,boolean[]visited,String[]member) {
		
		if(name.length()==member.length) {
			if(check(data,name)) answer++;
			
		}
		
		for(int i=0;i<member.length;i++) {
			
			if(!visited[i]) {
				visited[i] = true;
				String names = name + member[i];
				dfs(data,names,visited,member);
				visited[i] = false;
			}
			
		}
	}
	
	public static boolean check(String[]data,String name) {
		
		for(String s : data) {
			
			int pos1 = name.indexOf(s.charAt(0));
			int pos2 = name.indexOf(s.charAt(2));
			char ch = s.charAt(3);
			int idx = s.charAt(4)-'0';
			
			if(ch=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(ch=='<') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}else if(ch=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}
			
			
		}
		
		
		return true;
	}

}
