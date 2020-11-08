package 데이터;

public class 김도균 {

	public static void main(String[] args) {

		int age =100;
		double eye = 1.5;
		char gender ='남';
		boolean food = true;
		food = false;
		//타입 변수명; //램에 공간이 할당, 선언!
		//자바는 선언할 때 램에 공간이 만들어진다.! 
		
		
		String name = "김도균";
		// 스트링(실) 김--도--균
		
		
		System.out.println("내 이름은 " + name + "입니다");
		System.out.println("내 나이는 " + age + "세입니다.");
		System.out.println("나는 " + gender + "입니다.");
		
		System.out.println("내 시력은 " + eye + "입니다.");
		System.out.println("나는 점심을 먹었나?" + food);
		
	
	}

}
