package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		
		
		int x = 200;
		int y = 100;
		//비교연산자의 결과는 반드시 논리형!(boolean, ture/false)
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x >= y);
		
		int id = 1111; //회원가입할 때의 저장된 id 
		int id2 = 1111; //로그인할 때의 id입력
		
		if (id == id2) {//조건은 비교연산!!이 들어가게!!
			//조건이 맞으면 실행되는 부분
			System.out.println("로그인 성공!!");
		} else {
			//조건이 안맞으면 실행되는 부분
			System.out.println("로그인 실패!!");
		}
		
		
		
	}

}
