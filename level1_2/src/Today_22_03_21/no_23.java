package Today_22_03_21;

public class no_23 {

	public static void main(String[] args) {
		
		int price = 3;
		int money = 20;
		int count = 4;
		int result = 0;
		
		for(int i=1;i<=count;i++) {
			
			money -= price*i;
			
			System.out.println(price*i);
			
			
		}

		
		
		System.out.println(money);
		
	}
}
