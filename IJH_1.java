package JavaStudy;
class Book{
	String bookn;
	String name;
	double money;
	private static double sale;
	
	public Book(String bookn, String name, double money) {
		
	}
	public Book() {
		
	}
	
	public void displayInfo() {
		System.out.println("책 제목 : "+this.bookn);
		System.out.println("저자 : "+this.name);
		System.out.println("책 가격 : "+this.money);
	}
	public double applyDiscount() {
		money -= money * sale;
		return money;
	}
	public double getPrice() {
		return applyDiscount();
	}
	public static void changeDiscount(double sale) {
		Book.sale = sale;
	}
}

public class IJH_1 {
	public static void main(String args[]) {
		Book J = new Book("자바", "A", 38000);
		Book P = new Book("파이썬", "B", 60000);
		
		Book.changeDiscount(0.08);
		
		
	}
}
