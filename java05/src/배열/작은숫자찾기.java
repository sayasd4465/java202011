package 배열;

public class 작은숫자찾기 {

	public static void main(String[] args) {
		int[] n = {33, 66, 11, 44, 88};
		int min = n[0]; //33
		for (int i = 1; i < n.length; i++) {
		
				if(min > n[i]) { //11
					min = n[i];
				}
			
		}
		System.out.println(min);
		
	}

}
