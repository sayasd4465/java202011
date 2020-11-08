
package 배열;

import java.util.ArrayList;

public class 많은양묶기2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("필통");
		list.add("휴대폰");
		list.add(1000);
		
		System.out.println(list);
		
		list.add(2000);
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println("남아있는 물건의 갯수 : " + list.size() + "개");
		
		
		
		
		
		
		
	}

}
