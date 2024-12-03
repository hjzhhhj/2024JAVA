package InT;

public class Rec {
	int sero;
	int garo;
	int jung;
	
	Rec(int sero, int garo){
		this.sero = sero;
		this.garo = garo;
	}
	
	Rec(int jung){
		this.jung = jung;
	}
	
	public static void main(String args[]) {
		Rec re1 = new Rec(4, 5);
		System.out.println(re1.sero*re1.garo);
		Rec rer = new Rec(6);
		System.out.println(rer.jung*rer.jung);
	}
}
