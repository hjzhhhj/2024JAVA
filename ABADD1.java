package JavaStudy;

import java.util.Scanner;

public class ABADD1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("A와 B와 C의 합은?:" + (A + B + C));
        System.out.println("A와 B와 C의 평균은?:" + ((A + B + C) / 3.0));
    }
}
