package InT;

class sStaticSample {
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}
public class Ex1 {
	public static void main(String args[]) {
		sStaticSample.m = 10;
		sStaticSample s1;
		
		s1 = new sStaticSample();
		System.out.println(s1.m);
		s1.f();
		sStaticSample.f();
	}
}
