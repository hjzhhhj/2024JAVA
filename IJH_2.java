package JavaStudy;

class AppleSeller {
	int applePrice;
	
	AppleSeller(int applePrice) {
		this.applePrice = applePrice;
	}
	
	public int getApplePrice() {
		return applePrice;
	}
	public void sellApple(AppleBuyer money) {
		if ( AppleBuyer.money < applePrice ) {
			System.out.println("돈이 부족합니다.");
		}
		else {
			System.out.println("사과를 판매했습니다! 남은 돈 : "+(AppleBuyer.money-applePrice));
		}
	}
}

class AppleBuyer {
	static int money;
	
	AppleBuyer(int money) {
		AppleBuyer.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	public void buyApple(AppleSeller applePrice) {
		if ( money < applePrice.applePrice ) {
			System.out.println("돈이 부족합니다.");
		}
		else 
			System.out.print("사과를 구매했습니다! 남은 돈 : "+(money-applePrice.applePrice));
	}
	
}
public class IJH_2 {
	public static void main(String args[]) {
		AppleSeller as = new AppleSeller(4500);
		AppleBuyer ab = new AppleBuyer(160000);
		System.out.println("김효일 : 어서오세요! 갓재배한 사과 한 알 사실래유?");
		System.out.println("윤정후 : 네 사과 한 알 주세요");
		System.out.println("김효일 : 예 "+as.applePrice+"원입니다~~~^^");
		System.out.println("윤정후 : 예 ㄳ합니다");
	}
}
