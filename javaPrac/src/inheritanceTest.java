class MyPoint{
	int x;
	int y;
}

class Circle{  //포함 관계

	MyPoint p = new MyPoint();
	int r;
}

public class inheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r= 3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
	}

}
