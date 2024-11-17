package JavaStudy;

class GrandFather {
	private String name;
	public GrandFather(String name) {
		this.name = name;
		System.out.println("GrandFather 생성자");
	}
}

public class MyClass extends GrandFather {
	public MyClass(String str) {
		super(str);
		System.out.println("MyClass 생성자");
	}
	
	public static void main(String args[]) {
		MyClass s = new MyClass("홍길동");
	}
}
