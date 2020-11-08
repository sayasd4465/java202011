package 클래스활용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Diary {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public void open() {

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.setTitle("일기를 쓰시오");
		f.getContentPane().setLayout(null);
		
		JLabel 날짜 = new JLabel("오늘의 날짜");
		날짜.setHorizontalAlignment(SwingConstants.CENTER);
		날짜.setFont(new Font("굴림", Font.BOLD, 32));
		날짜.setBounds(78, 10, 297, 49);
		f.getContentPane().add(날짜);
		
		textField = new JTextField();
		textField.setBackground(Color.GREEN);
		textField.setBounds(36, 50, 378, 42);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel 제목 = new JLabel("오늘의 제목");
		제목.setFont(new Font("굴림", Font.BOLD, 32));
		제목.setHorizontalAlignment(SwingConstants.CENTER);
		제목.setBounds(53, 82, 350, 67);
		f.getContentPane().add(제목);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.GREEN);
		textField_1.setBounds(36, 136, 378, 54);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel 내용 = new JLabel("오늘의 내용");
		내용.setHorizontalAlignment(SwingConstants.CENTER);
		내용.setFont(new Font("굴림", Font.BOLD, 32));
		내용.setBounds(23, 189, 412, 49);
		f.getContentPane().add(내용);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.GREEN);
		textField_2.setBounds(46, 248, 367, 140);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 32));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(53, 398, 358, 53);
		f.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = 날짜.getText();
				String data2 = 제목.getText();
				String data3 = 내용.getText();
				
				try {
					FileWriter file = new FileWriter(data1 + ".txt");
					file.write(data1 + "\n");
					file.write(data2 + "\n");
					file.write(data3 + "\n");
					file.close();
				} catch (Exception e2) {
				}
				
			} 
		});
		
		f.setVisible(true);
		
		
		
	}
}
