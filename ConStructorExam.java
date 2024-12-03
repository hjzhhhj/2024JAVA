package JavaStudy;

public class ConStructorExam {
	public static void main(String args[]) {
		Student1 kim = new Student1( ) ;
		Student1 jang = new Student1( "장민재" ) ;
		System.out.println("학생의 이름은 " + kim.name + "입니다.") ;
		System.out.println("학생의 이름은 " + jang.name + "입니다.") ;
	}
}
class Student1{
	String name ;
	int grade ;
	int ban ;
	int number ;
	String telephone ;
	public Student1() {}
	public Student1(String n){name = n;}
}
