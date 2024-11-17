package JavaStudy;
import java.util.Scanner;

public class IJH_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Polygon py;
		for ( int i = 0; i < 5; i++ ) {
			System.out.print("변의 갯수를 입력하세요 3, 4, 5 중 하나! : ");
			int num = sc.nextInt();
			if ( num == 3 ) {
				py = new Triangle(num);
			}
			else if ( num == 4 ) {
				py = new Square(num);
			}
			else if ( num == 5 ) {
				py = new Pentagon(num);
			}
			else {
				System.out.println("오류!!! 적절한 갯수를 다시 입력하세요");
				continue;
			}
			System.out.println("내각의 크기는? : "+py.calculation(num)+"도 입니다!");
		}
	}
}

abstract class Polygon {
    int side;

    Polygon(int side) {
        this.side = side;
    }

    abstract int calculation(int side);
}

class Triangle extends Polygon {
    Triangle(int side) {
        super(side);
    }

    @Override
    int calculation(int side) {
        return 180 / side;
    }
}

class Square extends Polygon {
    Square(int side) {
        super(side);
    }

    @Override
    int calculation(int side) {
        return 360 / side;
    }
}

class Pentagon extends Polygon {
    Pentagon(int side) {
        super(side);
    }
    
    @Override
    int calculation(int side) {
        return 540 / side;
    }
}
