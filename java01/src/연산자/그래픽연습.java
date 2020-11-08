package 연산자;

import javax.swing.JOptionPane;

public class 그래픽연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력"); //홍길동
		System.out.println(name);
		
		
		//int age = 100;
		//외부에서 입력하는 변수에 넣어주는 경우는
		//컴퓨터는 무조건 String처리함.!
		
		
		String age = JOptionPane.showInputDialog("나이를 입력");
		int age2 = Integer.parseInt(age);
		
		System.out.println(age2 + 1 + "세");
		
		
	
	}

}
