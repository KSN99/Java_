package chap_06;

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price=price;
		this.bonusPoint=(int)(price/10.0);	
		}
	Product(){	}
}

class Tv2 extends Product{
	public Tv2() {super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer{
	int money = 1000;
	int bonusPoint= 0;
	Product[] cart = new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액 부족");
			return;
		}
	money-=p.price;
	bonusPoint+=p.bonusPoint;
	cart[i++] =p;
	System.out.println(p+"을 구매하셨습니다.");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) {break;}
			sum+=cart[i].price;
			itemList+=cart[i]+", ";
	}
		System.out.println("Total Sum:" + sum+"만원");
		System.out.println("구입하신 제품: "+ itemList+"입니다.");
}
}

public class Ex7_9 {

	public Ex7_9() {}

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();

	}

}
