package Today_22_03_24_lv_2;

public class no_42 {
	
	public static void main(String[] args) {
		
		String skill = "CBD";
		String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int answer = skill_trees.length;
		
		for(int i=0;i<skill_trees.length;i++) {
			String check =skill_trees[i].replaceAll("[^"+skill+"]","");
			System.out.println(check+ "체크");
			System.out.println(skill+ "스킬");
			System.out.println(skill.indexOf(check));
			
			if(skill.indexOf(check)!=0) answer--;
			
			
		}
		
		System.out.println(answer);
		
	}

}
