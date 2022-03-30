package ForDev_Matching;

import java.util.HashMap;
import java.util.Map;

public class toothbrush {

	public static Map<String, Integer> map = new HashMap<>();
	public static Map<String,String> connect = new HashMap<>();
	
	public static void main(String[] args) {
		
	// 칫솔의 판매에 의하여 발생하는 이익에서 10%를 계산하여 위에 드림 나머진 내꺼
	//근데 내가 추천을 받아서 10프로 받은거 포함해서 위에 사람한테 10프로 줌
	//원 단위로 절사
	//1원 미만인 경우에는 자신이 모두 가짐
		
	String [] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
	String [] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
	String [] seller = {"young", "john", "tod", "emily", "mary"};
	
	int [] amount = {12,4,2,5,10};
	
	int[] answer = new int[enroll.length];
	
	for(int i=0;i<enroll.length;i++) {
		
		map.put(enroll[i],0);
		connect.put(enroll[i], referral[i]);
		
	}
	
	for(int i=0;i<seller.length;i++) {
		
		dfs(seller[i],amount[i]*100);
		
	}
	
	for(int i=0;i<answer.length;i++) {
		answer[i] = map.get(enroll[i]);
	}
	
	for(int i : answer)System.out.println(i);
	
	}
	
	public static void dfs(String seller, int money) {
		
		if(seller.equals("-")||money==0) return;
		
		
		int myMoney = (int)(Math.ceil(money*0.9));
		int otherMoney = money - myMoney;
		
		map.replace(seller, map.get(seller)+myMoney);
		
		String nextPerson = connect.get(seller);
		
		dfs(nextPerson,otherMoney);
		
		
		
	}
	
}