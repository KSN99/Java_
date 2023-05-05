package chap_06;

class MyPoint{
	int x;
	int y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "x:"+x+", y: "+y;
	}
}

public class OverridingTest {

	public OverridingTest() {
	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 2);
		System.out.println(p);
	}

}
