package JavaStudy;

class Subway {
	String lineNum;
	int passenger;
	int money;
	
	Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	public void showInfo() {
		System.out.println("지하철 호선 : "+lineNum+", 승객 수 : "+passenger+"총 수입 : "+money);
	}
}

public class IJH_3 {
	public static void main(String args[]) {
		
	}
}
