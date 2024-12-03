package InT;

class Point{
	private int x;
	private int y;

	public void set(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	public void sset(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class ColorPointEx{
	public static void main(String args[]) {
		Point P = new Point();
		P.set(1, 2);
		
		ColorPoint CP = new ColorPoint();
		CP.set(3, 4);
		CP.sset("red");
		
		CP.showColorPoint();
	}
}
