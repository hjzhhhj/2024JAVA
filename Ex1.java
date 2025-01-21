package hi;
//1116 정희진
import java.util.Random;

public class Ex1 {
    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    class Circle {
        private Point center;
        private int radius;

        public Circle(Point center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        public double Area() {
            return Math.PI * radius * radius;
        }

        public void printCircle() {
            System.out.printf("점의 좌표<%d, %d>인 반지름 %d인 원의 넓이 : %.3f\n",
                    center.x, center.y, radius, Area());
        }
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int x = random.nextInt(101);
            int y = random.nextInt(101);
            int radius = random.nextInt(10) + 1;

            Point p = ex.new Point(x, y);
            Circle cir = ex.new Circle(p, radius);
            cir.printCircle();
        }
    }
}
