package 클래스활용;

import 클래스만들기.Phone;

public class Phone활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		phone.on();
		phone.shape = "네모";
		phone.size = 20;
		phone.bright = 100;
		
		System.out.println("phone 전화기 모양은 " + phone.shape);
		System.out.println(phone);
		
		Phone phone2 = new Phone();
	
		phone.off();
		phone.shape = "세모";
		phone.size = 20;
		phone.bright = 90;
		
		System.out.println(phone2);
		

	}

}
