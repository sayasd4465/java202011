package 클래스만들기;

public class Phone {
	//상태 => 멤버 변수
	public String shape;
	public int size;
	public int bright;
	public String company;
	
	
	// 동작=>함수(멤버 매소드)
	public void on() {
		System.out.println("전화를 받다");
	}
	
	public void off() {
		System.out.println("전화를 끊다");
	}

}
