package Today_22_05_06;

public class Nqueen {
	
	static char[]member = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
	static boolean[]visited = new boolean[member.length];
	static int answer = 0;
	static String[]datas;
	
	public static void main(String[] args) {
		
		String [] data = {"M~C<2", "C~M>1"};
		datas = data.clone();
		int n = 2;
		
		
		dfs("");
		
		System.out.println(answer);
	}
	public static void dfs(String now) {
		if(now.length() == member.length) {
			if(check(now)) { 
				answer++;
			};
			return;
			
		}
		
		for(int i=0; i<member.length;i++) {
			
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + member[i];
				dfs(newOne);
				visited[i] = false;
			}
		}
		
	}
	
	public static boolean check(String now) {
		
		
		for(String s : datas) {
			String one = ""+s.charAt(0);
			String two = ""+s.charAt(2);
			String opp = ""+s.charAt(3);
			int idx = Integer.parseInt(""+s.charAt(4))+1; //1 0 ,
			int numCheck = Math.abs(now.indexOf(one)-now.indexOf(two)); //2 0, 2
			
			if(opp.equals(">")&& numCheck <= idx) {
				
				return false;
			}
			else if(opp.equals("<")&&numCheck >= idx) {
				
				return false;
				
			}else if(opp.equals("=")) {
				if(idx != numCheck) {
				
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	
}