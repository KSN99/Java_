class Product{
	int price;//제품 가격
	int bonusPoint;//제품 구매시 제공하는 포인트
	public Product(int price) {
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
	public Product() {}
}

class Tv extends Product{
	public Tv() {
		super(100);
	}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	Product[] cart=new Product[10];
	int i =0;
	
	//buy 메서드 생성 
	void buy(Product p){
		if(money<p.price) {System.out.println("Lack of Balance");
		return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p;
		System.out.println(p);
	}
	
	void summary() {
		int sum=0;
		String itemList=" ";
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum +=cart[i].price;
			itemList +=cart[i]+ ", ";
		}
		System.out.println("sum: "+sum);
		System.out.println("itemList: "+itemList);
	}
}

public class PolymorphismPros {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
