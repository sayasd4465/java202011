package 복습;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		// 자바는 부품조리식 언어(객체 지향 언어, OOP)
		// 컨트롤+스페이스바: 자동완성
		
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		ImageIcon icon = new ImageIcon("dog.png");
		
		f.setSize(300,300); // 가로값, 세로값
		b1.setText("강아지");
		
		f.add(b1);
		
		b1.setIcon(icon);
		
		
		
		
		
		
		
		// 맨 끝에 놔두어야 함. 
		f.setVisible(true);
		
		
		
		
		
	}

}
