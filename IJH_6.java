package JavaStudy;

import java.util.Scanner;

abstract class Book1{
	public void BookInfo() {

		while ( true ) {
			System.out.println("책 제목을 입력하세요 : ");
		}
	}

	abstract class GaBook extends Book1{

	}

	abstract class NaBook extends Book1{

	}

	abstract class DaBook extends Book1{

	}

	abstract class RaBook extends Book1{

	}

	public class IJH_6 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		}
	}
}
