package JavaStudy;

class Car{
	Car(){}
	Car(String name){  
		System.out.println("차 이름이 있는 생성자");
	}
}
class Truck extends Car{
	Truck(){
		super("SM3");
		System.out.println("Truck 생성자");
	}
	public static void main(String[] args){
		Truck mytruck = new Truck(); 
	}
}
