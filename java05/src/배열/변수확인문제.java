package 배열;

public class 변수확인문제 {

	public static void main(String[] args) {
		
		
	int 수학점수 = 100;
	int 영어점수  = 수학점수 - 10;
	System.out.println("수학점수 : " + 수학점수);
	System.out.println("영어점수 : " + 영어점수);
	
	int[] 수학점수목록 = {100, 99, 88};
	
	int[] 영어점수목록 = 수학점수목록.clone();
	영어점수목록[1] = 77;
	
	for (int i : 수학점수목록) {
		System.out.print(i+ " ");
		
	}
	System.out.println();
	for (int i : 영어점수목록) {
		System.out.print(i+ " ");
		
	}
	
	}

}
