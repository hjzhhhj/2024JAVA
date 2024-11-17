package JavaStudy;

public class ConStructorExam {
	public static void main(String args[]) {
		Student kim = new Student( ) ;
		Student jang = new Student( "장민재" ) ;
		System.out.println("학생의 이름은 " + kim.name + "입니다.") ;
		System.out.println("학생의 이름은 " + jang.name + "입니다.") ;
	}
}
class Student{
	String name ;
	int grade ;
	int ban ;
	int number ;
	String telephone ;
	public Student() {}
	public Student(String n){name = n;}
}
