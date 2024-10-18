package JavaStudy;

import java.util.Scanner;

public class AB{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = ( a * 10 )+b;
		int c1 = ( b * 10 )+a;
		int d;
		d = ( c > c1 ) ? c : c1 ;
		System.out.println(d);
	}
}

