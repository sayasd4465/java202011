package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		int s1; // 저장될 타입 변수명; ram에 공간이 할당!
		//선언!!!할 때 자바는 램에 공간이 할당!
		//선언된 위치가 이 변수가 살 수 있는 공간
		
		
		
		int[] s = new int[10]; //3층
		System.out.println(s);
		System.out.println(s[0]);
		
		//위치값은 0부터 시작
		s[0] = 100;
		System.out.println(s[0]);
		
		//5번째에 500을 넣어서 프린트
		s[4] = 500;
		System.out.println(s[4]);
		
		//마지막째엔 900을 넣어서 프린트
		s[9] = 900;
		System.out.println(s[9]);
		
		System.out.println(s.length); //읽기 전용
		//배열의 개수가 자동계산되어 들어가 있는 변수
		
		//마지막 위치값
		System.out.println(s[s.length-1]);
		
	} 

	
}
