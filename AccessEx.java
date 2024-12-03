package InT;

class Sample{
	public int a;
	private int b;
	int c;
}
public class AccessEx {
	public static void main(String args[]) {
		Sample aClass = new Sample();
		System.out.println(aClass.a = 10);
		// aClass.b = 10;
		System.out.println(aClass.c = 10);
	}
}
