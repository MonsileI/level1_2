package Today_22_05_02;

import java.util.ArrayList;

public class skillTree {

	static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String skill = "CBD";
		String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		for(int i=0;i<skill_trees.length;i++) {
			skill_trees[i] = skill_trees[i].replaceAll("[^"+skill+"]", "");
		}
		
		int answer = 0;
		
		
		for(int j=skill.length();j>-1;j--) {
			String temp = skill.substring(j);
			for(int i=0;i<skill_trees.length;i++) {
				if(temp.equals(skill_trees[i])){
					answer++;
					continue;
				}
			}
			
		}
		
		System.out.println(answer);
	
		

		
	}
	
	
}
