package ������;

import javax.swing.JOptionPane;

public class ���ڿ����� {

	public static void main(String[] args) {
		
	String n1 = JOptionPane.showInputDialog("����1�Է�");
	String n2 = JOptionPane.showInputDialog("����2�Է�");
	int n11 =Integer.parseInt(n1);
	int n22 =Integer.parseInt(n2);
	System.out.println(n11 + n22);
	System.out.println(n11 - n22);
	System.out.println(n11 * n22);
	System.out.println(n11 / n22);
	
	//null, ���ٶ���ǹ�, ��
	
	JOptionPane.showMessageDialog(null, n11 + n22);
	
	
	
			
		
		
		
		
	}

}
