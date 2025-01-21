package hi;
// 1116 정희진
import java.util.Scanner;

abstract class Shape {
    abstract double Circumference();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double Circumference() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double Circumference() {
        return 2 * (length + width);
    }
}

class Sector extends Shape {
    private double radius;

    public Sector(double radius) {
        this.radius = radius;
    }

    @Override
    double Circumference() {
        return Math.PI * radius + 2 * radius;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[7];
        int count = 0;

        while (count < 7) {
            System.out.print("도형 선택(1: 원, 2: 사각형, 3: 부채꼴): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("반지름 입력: ");
                    double radius = sc.nextDouble();
                    shapes[count] = new Circle(radius);
                    break;

                case 2:
                    System.out.print("가로 입력: ");
                    double length = sc.nextDouble();
                    System.out.print("세로 입력: ");
                    double width = sc.nextDouble();
                    shapes[count] = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("반지름 입력: ");
                    radius = sc.nextDouble();
                    shapes[count] = new Sector(radius);
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    continue;
            }
            count++;
        }

        System.out.println("\n<<결과 출력>>");
        double maxCircumference = 0;
        int maxIndex = -1;

        for (int i = 0; i < shapes.length; i++) {
            double circumference = shapes[i].Circumference();
            System.out.printf("%d번째 도형의 둘레: %.10f\n", i + 1, circumference);

            if (circumference > maxCircumference) {
                maxCircumference = circumference;
                maxIndex = i + 1;
            }
        }

        System.out.printf("\n둘레의 길이가 가장 긴 도형은 %d번째 도형이며, 둘레는 %.10f입니다.\n",
                maxIndex, maxCircumference);

        sc.close();
    }
}
