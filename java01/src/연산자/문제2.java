package ������;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ����2 {

	public static void main(String[] args) {
		// ���� �Ⱦ��� ��ǰ
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		
		JButton b = new JButton();
		b.setText("���� ������!!!");
		f.add(b);
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		
		//�ڵ� import : ��Ʈ�� + ����Ʈ+ o
		
		Font font = new Font("�ü�", 1, 50);
		b.setFont(font);
		
		
		f.setVisible(true);
		
		
		
		
	}

}
