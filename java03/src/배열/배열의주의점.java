package 배열;

public class 배열의주의점 {

	public static void main(String[] args) {
		// 배열을 쓸 때는 공간을 만드는 순간에 값을 이미 알고 있는지 
		// 모르고 있는지 체크해야함.
		// 1. 값을 모르는 경우 : 공간을 일단 만들고 난후, 나중에 값을 넣음
		// 2. 값을 아는 경우: 공간을 만들면서, 바로 값을 넣음
		
		int[] jumsu = {100, 80, 90, 60, 55};
		jumsu[0] = 90;
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		//가족의 키(double), 나이(int), 이름(String), 
		//성별(char), 저녁을 먹었는지(boolean)
		//프린트!
		double[] height = {170, 171, 165, 160};
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
		int[] age = {65, 60, 29, 26};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		String[] name = {"김도균", "김병천", "배은정", "김기령"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		char[] gender = {'남','남','여','여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		
		boolean[] food = {true, true, true, true};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		
		
		
	}

}
