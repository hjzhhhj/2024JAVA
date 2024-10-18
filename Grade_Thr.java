package JavaStudy;

class People {
	String name;
	int age;
	public void printMyself() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	public void printScore() {
		
	}
}
class Grade_std extends People {
	Grade_std(String name, int age, int korean, int math, int english) {
		
	}
}
   
public class Grade_Thr {
	public static void main(String args[]) {
		Grade_std std = new Grade_std("홍길동", 18, 100, 90, 80);
		std.printMyself();
		std.printScore();
	}
}
