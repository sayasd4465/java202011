package 네트워크;

public class 회원가입 {

	public static void main(String[] args) {

		System.out.println("id    pw     name    tel");
		System.out.println("==========================");
		 회원 p1 = new 회원 ();
		 p1.id = "root";
		 p1.pw = 1234;
		 p1.name = "park";
		 p1.tel = 011;
		 
		 회원 p2 = new 회원 ();
		 p2.id = "admin";
		 p2.pw = 1111;
		 p2.name = "kim";
		 p2.tel = 012;
		 
		 회원 p3 = new 회원 ();
		 p3.id = "apple";
		 p3.pw = 2222;
		 p3.name = "song";
		 p3.tel = 013;
		 
		 회원 p4 = new 회원 (); //메서드
		 p4.id = "melon";
		 p4.pw = 3333;
		 p4.name = "jung";
		 p4.tel = 014;
		
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 System.out.println(p4);
		
		
	}

}
