package InT;

import java.util.Scanner;

public class ScoreAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[3][2];
		int answer = 0;
		System.out.println("3년간 1학기, 2학기의 성적을 차례대로 입력하십시오.");
		for ( int i = 0; i < 3; i++ ) {
			for ( int j = 0; j < 2; j++ ) {
				score[i][j] = sc.nextInt();
			}
		}
		for ( int i = 0; i < 2; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				answer += score[i][j];
			}
		}
		System.out.println("3년 전체 평균점수의 평균은 "+(answer/6)+"점 입니다.");
	}
}