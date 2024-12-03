package InT;

abstract class Unit {
	int x, y;
	void stop() {

	}
	abstract void move(int x, int y);
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Marine[x="+x+", y="+y+"]");
	}
	void stimPack() {

	}
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Tank[x="+x+", y="+y+"]");
	}

	void changeMode() {

	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("DropShip[x="+x+", y="+y+"]");// TODO Auto-generated method stub

	}

	void load() {

	}

	void unload() {

	}
}

public class Game{
	public static void main(String args[]) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();

		for ( int i = 0; i < group.length; i++ ) {
			group[i].move(100,200);
		}
	}
}
