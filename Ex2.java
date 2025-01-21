package hi;
// 1116 정희진
import java.util.Scanner;

public class Ex2 {
    class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double Round() {
            return 2 * (width + height);
        }

        public double Area() {
            return width * height;
        }

        public void printRectangle(int index) {
            System.out.printf("%d번 사각형\n", index);
            System.out.printf("가로 %.2f이고, 세로 %.2f인 사각형의 둘레 : %.2f, 면적 : %.4f\n", width, height, Round(), Area());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2 program = new Ex2();

        System.out.print("생성할 사각형의 갯수를 입력하시오. : ");
        int numRectangles = sc.nextInt();

        Rectangle[] rectangles = new Rectangle[numRectangles];

        for (int i = 0; i < numRectangles; i++) {
            System.out.printf("%d번 사각형\n", i + 1);
            System.out.print("가로길이 입력 : ");
            double width = sc.nextDouble();
            System.out.print("세로길이 입력 : ");
            double height = sc.nextDouble();

            rectangles[i] = program.new Rectangle(width, height);
        }

        for (int i = 0; i < numRectangles; i++) {
            rectangles[i].printRectangle(i + 1);
        }

        sc.close();
    }
}