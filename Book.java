package InT;

public class Book {
	String title;
	String author;
	
	Book(String title) {
		this.title = title;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	void print() {
		System.out.print("작가는 "+author+"이고, 제목은 "+title+"입니다.");
	}
	
	public static void main(String args[]) {
		Book b1 = new Book("어린왕자", "이효은");
		Book b2 = new Book("하이친구들");
		b1.print();
		b2.print();
	}
}
