package InT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개를 입력히세요");

		int sum = 0; 
		int n = 0;

		for ( int i = 0; i < 3; i++ ) {
			System.out.print(i+">>");
			try { 
				n = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.nextLine();
				i--;
			}
		}
	}
}
