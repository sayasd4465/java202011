package 네트워크;

public class 은행 {

	public static void main(String[] args) {

		계좌 dad = new 계좌();
		dad.name = "홍길동";
		dad.field = "튼튼적금";
		dad.price = 1000;
		
		dad.입금하다();
		System.out.println(dad);
		
		계좌 mom = new 계좌();
		mom.name = "홍기사";
		mom.field = "다운적금";
		mom.price = 3000;
		
		mom.출금하다();
		System.out.println(mom);
		
		계좌 girl = new 계좌();
		girl.name = "홍사장";
		girl.field = "업적금";
		girl.price = 1000;
		
		girl.출금하다();
		System.out.println(girl);
		
		
	}
	
}
