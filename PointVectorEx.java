package InT;

import java.util.Vector;

class Point0{
	private int x, y;
	public Point0(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
}
public class PointVectorEx {
	public static void main(String args[]) {
		Vector<Point0> v = new Vector<Point0>();
		
		v.add(new Point0(2, 3));
		
		for ( int i =0; i < v.size(); i++ ) {
			Point0 p = v.get(i);
			System.out.println(p);
		}
	}
}
