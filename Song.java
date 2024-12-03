package InT;

public class Song {
	String title;
	String singer;
	String year;
	String country;
	
	public void show(String title, String singer, String year, String country) {
		System.out.println(year+"년 "+country+"의 "+singer+"가 부른 "+title);
	}
	
	public static void main(String args[]) {
		Song so = new Song();
		so.show("Welcome to the show", "Day6", "2024", "한국");
	}
}
