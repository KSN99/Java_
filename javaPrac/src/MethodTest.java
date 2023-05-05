package chap_06;

public class MethodTest {

	public static void main(String[] args) {
		MyMath mm=new MyMath();
		long result1 = mm.add(4, 7);
		System.out.println(result1);
		long result2 = mm.max(9, 3);
		System.out.println(result2);
	}

}

class MyMath {
	long add(long a, long b) {return a+b;}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
	long max(long a, long b) {return (a>b)? a:b;}
}