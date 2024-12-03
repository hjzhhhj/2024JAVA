package InT;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public void getArea(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.print(this.width*this.height);
		
		/*
		 * public int getArea(){
		 * return width * height;
		 * }
		 * */
		
	}

	public static void main(String args[]) {
		Rectangle re = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력해보세용 : ");
		int num1 = sc.nextInt();
		System.out.print("높이를 입력해보세용 : ");
		int num2 = sc.nextInt();
		re.getArea(num1, num2);
		
		/* re.width = sc.nextInt();
		 * re.height = sc.nextInt();
		 * syso re.getArea();
		 * */
	}
}

