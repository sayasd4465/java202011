package 클래스활용;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField id;
	private static JTextField pw;

	public static void main(String[] args) {
		
		//기본틀 부품필요
		
		JFrame f = new JFrame();
		f.getContentPane().setForeground(Color.CYAN);
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\KIM DO KYUN\\java05\\일기장.png"));
		lblNewLabel.setBounds(0, 10, 490, 233);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(10, 252, 101, 71);
		f.getContentPane().add(lblNewLabel_1);
		
		id = new JTextField();
		id.setFont(new Font("굴림", Font.PLAIN, 46));
		id.setForeground(Color.BLUE);
		id.setBackground(Color.WHITE);
		id.setBounds(102, 258, 354, 57);
		f.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel_1_1.setBounds(10, 317, 101, 71);
		f.getContentPane().add(lblNewLabel_1_1);
		
		pw = new JTextField();
		pw.setFont(new Font("굴림", Font.PLAIN, 46));
		pw.setBackground(Color.WHITE);
		pw.setColumns(10);
		pw.setBounds(102, 333, 354, 57);
		f.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id2 = id.getText(); //id 텍스트 필드에 입력한 값을 가져온다
				String pw2 = pw.getText(); //pw 텍스트 필드에 입력한 값을 가져온다
				System.out.println("가지고 온 id: " + id2);
				System.out.println("가지고 온 pw: " + pw2);
				
				String id3 = "root";
				String pw3 = "1234";
				
				if ( id2.equals(id3) && pw2.equals(pw3) ) {//and 연산자 : 조건이 모두 true!
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Diary d = new Diary();
					d.open();
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");

				}
				
			}
			
		});
		btnNewButton.setIcon(new ImageIcon("D:\\KIM DO KYUN\\java05\\로그인.png"));
		btnNewButton.setBounds(27, 448, 429, 71);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\KIM DO KYUN\\java05\\RESET 버튼.png"));
		btnNewButton_1.setBounds(502, 433, 270, 118);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(800, 800);
		f.setTitle("로그인 화면");
		
		
		//일기장 이미지 넣을 부분 필요
		f.setVisible(true);
		
		

	}
}
