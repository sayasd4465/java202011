package 복습;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의버튼들 {
	private static JTextField text;
	private static int count = 0;
	
	public static void main(String[] args) {
		Random r = new Random();
		
		
		int target = r.nextInt(99) + 1; // 0~98 + 1 
		System.out.println("정답>> " + target);
		

		JFrame f = new JFrame();
		f.setTitle("숫자 맞추기 게임");
		f.setSize(300,300);
		
		JButton b1 = new JButton("숫자를 맞춰보자!");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//count = count + 1;
				count++; //증감연산자
				
				String data = text.getText();//"88"
				int data2 = Integer.parseInt(data);
				text.setText("");
			
				JOptionPane.showMessageDialog(f, "입력한 데이터는 " + data2);
				
				if (target == data2) {//비교연산자의 결과는 true,false
					JOptionPane.showMessageDialog(f, "정답입니다.");
					JOptionPane.showMessageDialog(f, count + "회 시도 했습니다.");
					
					
				} else {
					JOptionPane.showMessageDialog(f, "정답이 아닙니다. 다시 시도하세요.");
					
				if (target < date2) {
					JOptionPane.showMessageDialog(f, "너무커요.!!.");
					
				} else {
					JOptionPane.showMessageDialog(f, "너무 작아요.!!.");

				}
					

				}
				
			}
		});
		f.getContentPane().add(b1, BorderLayout.CENTER);
		
		text = new JTextField();
		f.getContentPane().add(text, BorderLayout.NORTH);
		text.setColumns(10);
		
		
	
		JLabel lblNewLabel = new JLabel("당신이 생각한 글자를 입력하세요");
		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		f.setVisible(true);
		
		
		
	}

}
