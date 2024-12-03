package InT;

public class MethodSample {
	public static void main(String args[]) {
		MethodSample a = new MethodSample();
		int i = a.getSum(1, 2);
		
		System.out.println(i);
		
		int j = a.getSum(1, 2, 3);
		
		System.out.println(j);
		
		double k = a.getSum(1.1, 2.2);
		
		System.out.println(k);
	}
	
	public int getSum(int i, int j) {
		return i + j;
	}
	
	public int getSum(int i, int j, int k) {
		return i + j + k;
	}
	
	public double getSum(double i, double j) {
		return i + j;
	}
}
