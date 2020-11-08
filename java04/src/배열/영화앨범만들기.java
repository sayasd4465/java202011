package 배열;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화앨범만들기 {
	static int count = 2;// 현재 위치 알려주는 변수
	
	
	public static void main(String[] args) {

		String[] title = {"삼진그룹 영어 토익반", "담보", " 위플래쉬", "미스터트롯: 더 무비", "소리도없이"};
		String[] list = {"01.png" ,"02.png", "03.png", "04.png", "05.png"};
		double[] jumsu = {9.27, 9.18, 8.87, 8.93, 7.89};
		JFrame f = new JFrame();
		f.setBackground(Color.BLUE);
		f.setSize(500,500);
		
		JLabel top = new JLabel(title[2]);
		top.setBackground(Color.MAGENTA);
		top.setFont(new Font("굴림", Font.BOLD, 23));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		f.getContentPane().add(center, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon(list[2]);
		center.setIcon(icon); 
		
		JLabel sub = new JLabel(jumsu[2] + "점");
		sub.setBackground(Color.MAGENTA);
		sub.setFont(new Font("굴림", Font.PLAIN, 27));
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count > 0) {
					count--; 
					top.setText(title[count]); 
					sub.setText(jumsu[count] + "점");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, " 왼쪽 막지막입니다.");
					
				}
			}
		});
					
			
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < 4) {
					count++;
					top.setText(title[count]);
					sub.setText(jumsu[count] + "점");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
					
				} else {
					JOptionPane.showMessageDialog(f, " 오른쪽 막지막입니다.");
				}
			} 
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		
		f.setVisible(true);
		}
	

}
