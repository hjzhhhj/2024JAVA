package InT;

import java.util.*;

public class HashMapStudentEx {
	public static void main(String[] args) {
		var map = new HashMap<String,Student4>();
		map.put("황기태", new Student4(1,"010-1111-1111"));
		map.put("이재문", new Student4(2,"010-2222-2222"));
		map.put("김남윤", new Student4(3,"010-3333-3333"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("종료")) {
				System.out.println("종료합니다...");
				break;
				Student4 student = new Student4();
			}
				
			}
	}
}
class Student4{
	int id;
	String tel;
	public Student4(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}