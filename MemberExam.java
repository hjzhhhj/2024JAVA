package JavaStudy;

public class MemberExam {
	public static void main(String args[]) {
		Student kim = new Student();
		Student jang = new Student();
		Student bak = new Student();
		System.out.println("생성된 학생 객체 수는 " + Student.count + "입니다.") ;
	}
}
class Student{
	String name ;
	int grade ;
	static int count = 0 ;
	public Student() {
		count++;
	}

}
