package InT;

class IngredientBox extends Box {

	public IngredientBox(String name, int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean consume() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Box{
	protected int size;
	protected String name;
	public Box(int size) {
		this.size = size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public abstract boolean consume();
	public abstract void print();
}
