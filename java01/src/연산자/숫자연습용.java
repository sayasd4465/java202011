package 연산자;

import javax.swing.JOptionPane;

public class 숫자연습용 {

	public static void main(String[] args) {
		
	String n1 = JOptionPane.showInputDialog("숫자1입력");
	String n2 = JOptionPane.showInputDialog("숫자2입력");
	int n11 =Integer.parseInt(n1);
	int n22 =Integer.parseInt(n2);
	System.out.println(n11 + n22);
	System.out.println(n11 - n22);
	System.out.println(n11 * n22);
	System.out.println(n11 / n22);
	
	//null, 없다라는의미, 널
	
	JOptionPane.showMessageDialog(null, n11 + n22);
	
	
	
			
		
		
		
		
	}

}
