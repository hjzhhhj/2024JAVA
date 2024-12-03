package InT;

public class InheritanceEx {
	public static void main(String args[]) {
		Student s = new Student();
		s.set();
	}
}

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 16;
		name = "이제호";
		height = 140;
		// weight = 200;
		setWeight(200);
		
	}
}
