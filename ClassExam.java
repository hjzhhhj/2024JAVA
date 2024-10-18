package JavaStudy;

public class ClassExam {
	public static void main(String args[]) {
		Student kim = new Student();
        kim.name = "김현우";
        kim.grade = 2;
		System.out.println("학생의 이름은 " + kim.name + "이고, " + kim.grade + "학년입니다.") ;
	}
}
    class Student{ 		
        String name;
        int grade;
        int ban;
        int number;
        String telephone;
}

