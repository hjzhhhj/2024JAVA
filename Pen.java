package InT;

class SharpPencil{
	private int width;
	private int amount;
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
}

class Ballpen{
	private int amount;
	private String color;
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

class FountainPen {
	private int amount;
	private String color;
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public void refill(int n) { setAmount(n); }
}

public class Pen {
	
}
