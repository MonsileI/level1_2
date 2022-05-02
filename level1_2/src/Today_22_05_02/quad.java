package Today_22_05_02;

public class quad {

	static int [] answer = new int[2];
	public static void main(String[] args) {
		
		int[][]arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
	
		
		int size = arr.length;
		
		binaryTree(arr,size,0,0);
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
	}
	static void binaryTree(int[][]arr,int size,int x,int y) {
		
		if(check(x,y,arr,size)) {
			answer[arr[x][y]]++;
			return;
		}else {
			
			binaryTree(arr,size/2,x,y);
			binaryTree(arr,size/2,x+size/2,y);
			binaryTree(arr,size/2,x,y+size/2);
			binaryTree(arr,size/2,x+size/2,y+size/2);
		}
		
		
	}
	static boolean check(int x,int y,int[][]arr,int size) {
		
		for(int i=x;i<size+x;i++) {
			for(int j=y;j<size+y;j++) {
				if(arr[x][y]!=arr[i][j]) {
					return false;
				}
			}
		}
		
		
		return true;
		
	}
}
