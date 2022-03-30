package Test;

import java.util.HashMap;

public class no_3 {

	static HashMap<String,Integer> map = new HashMap<>();
	static HashMap<String,String> linked = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		String[]enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[]referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[]seller = {"young", "john", "tod", "emily", "mary"};
		int [] amount = {12,4,2,5,10};
		int [] result = new int[enroll.length];
		
		for(int i = 0 ;i<enroll.length;i++) {
			map.put(enroll[i], 0);
			linked.put(enroll[i], referral[i]);
			
		}
		
		for(int i=0;i<seller.length;i++) dfs(seller[i],amount[i]*100);
			
		for(int i=0;i<result.length;i++) result[i] = map.get(enroll[i]);
		
		for(int i : result) System.out.println(i);
		
		
		
	}
	static void dfs(String seller,int amount) {
		
		if(seller.equals("-")||amount==0) return;
		
		int sellerMoney = (int)(Math.ceil(amount*0.9));
		int refMoney = amount - sellerMoney;
		
		String refName = linked.get(seller);
		
		map.replace(seller, map.get(seller)+sellerMoney);
		
		dfs(refName,refMoney);
		
		
		
		
	}
}
