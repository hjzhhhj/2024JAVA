package InT;

public class Car1 {
	String color;
	String yonryo;
	int door;
	String made;

	Car1(String color, String yonryo, int door, String made) {
		this.color = color;
		this.yonryo = yonryo;
		this.door = door;
		this.made = made;
	}

	public static void main(String args[]) {
		Car1 car = new Car1("흰색", "고급 휘발유", 4, "HJCAR");
	}
}
