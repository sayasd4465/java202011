package ������;

import javax.swing.JOptionPane;

public class �׷��ȿ��� {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է�"); //ȫ�浿
		System.out.println(name);
		
		
		//int age = 100;
		//�ܺο��� �Է��ϴ� ������ �־��ִ� ����
		//��ǻ�ʹ� ������ Stringó����.!
		
		
		String age = JOptionPane.showInputDialog("���̸� �Է�");
		int age2 = Integer.parseInt(age);
		
		System.out.println(age2 + 1 + "��");
		
		
	
	}

}
