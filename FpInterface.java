@FunctionalInterface
interface MyFunction{
	public abstract int max(int a, int b);
}
public class FpInterface {

	public static void main(String[] args) {//람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로.
		MyFunction f=(a,b)->a>b?a:b;// 람다식 . 익명객체
		int value=f.max(3, 5);
		System.out.println(value);
	}

}
