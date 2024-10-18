package JavaStudy;

class Car{
		String carname;
		String color;
		int velocity;
		void speedUp(){
			velocity += 5;
			System.out.println("속도 " +velocity + " 증가");
		}
		void speedDown(){
			velocity -= 5;
			System.out.println("속도 " +velocity + " 감소");
		}
	}
	class Truck extends Car{
	    int ton = 5;
	    void speedUp(){
	        velocity += 10;
	        System.out.println("속도 "+velocity+" 증가");
	    }
	}
	class MainTruckExam{
		public static void main(String[] args){
			Truck mytruck = new Truck();
			mytruck.speedUp();
			mytruck.speedDown();
		}
	}
