package JavaStudy;

public class pitagoras {
	public static void main(String[] args) {
		int x1 = 0, y1 = 0;
		int x2 = 3, y2 = 4;
		double pizza = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("거리 = " + pizza);
	}
}
