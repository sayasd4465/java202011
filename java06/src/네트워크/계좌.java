package 네트워크;

public class 계좌 {
	//전역변수
	String name;
	String field;
	int price;
	
	public void 입금하다() {
		System.out.println(name + "가 " + price + "원 입금하다.");
		
	}
	
	public void 출금하다() {
		System.out.println(name +"가 " + price + "가 출금하다.");
		
	}
	
	//원래 있던 매서드를 똑같이 서주면
	//다시 써준 매서드가 실행!!=> 재정의(override, 오버라이드)
	
	
	public String toString() {
		return name + ", " + field + ", " + price;
	}
}
