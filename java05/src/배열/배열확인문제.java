package 배열;

import java.util.Random;

public class 배열확인문제 {

	public static void main(String[] args) {
		
		Random r = new Random();
		double[] n = new double[500];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextDouble();
			
			
		}
		
		Double min = n[0]; 
		for (int i = 1; i < n.length; i++) {
		
				if(min > n[i]) { //11
					min = n[i];
				}
			
		}
			System.out.println("최소값 : " + min);
	
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if(min == n[i]) {
				count++;
			
			}
		}
			
		System.out.println("최소값의 개수: "+ count + "개");
		
	}
		
		 
		 
}
