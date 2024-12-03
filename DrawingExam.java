package JavaStudy;

class Car1{
	String name = "차";
	String print(){
		return "[나는 " + name + "이다.]";
	}
}
class Bus1 extends Car1{
		String name = "버스";
		String print(){
			return "[차의 종류는 " + name + "이다.]";
		}
}
class Truck1 extends Car1{
		String name = "트럭";
		String print(){
			return "[차의 종류는 " + name + "이다.]";
		}
}
class DrawingExam{
		public static void main(String[] args){
			Car1 mycar, yourcar;
			Bus1 mybus, yourbus;
			Truck1 mytruck, yourtruck;
			mycar = new Car1();
			mybus = new Bus1();
			mytruck = new Truck1();

			System.out.println("[" + mycar.print() + "]" );
			System.out.println("[" + mybus.print() + "]" );
			System.out.println("[" + mytruck.print() + "]" );
			yourcar = (Bus1)mybus;
            yourbus = (Bus1)yourcar;
			System.out.println("[" + yourbus.print() + "]" );
			yourcar = mytruck;
            yourtruck = (Truck1)yourcar;
			System.out.println("[" + yourtruck.print() + "]" );
		}
}
