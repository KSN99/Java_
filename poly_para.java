package java_11;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
	public String toString() {return "Tv";}
}

class computer extends Product{
	computer(){
		super(200);
	}
	public String toString() {return "computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족");
			return;
		}
	

	money-=p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p+"을 구매하셨습니다");
}
}

public class poly_para {

	public static void main(String[] args) {
		
		Buyer b= new Buyer();
		
		b.buy(new Tv1());
		b.buy(new computer());
		
		System.out.println("현재 남은 돈: "+b.money);
		System.out.println("현재 남은 point: "+b.bonusPoint);
	}
}
