package chap_06;

public class _02_Parameter {
	
	public static void power(int number) { // parameter 매개변수 
		int result = number * number;
		System.out.println(result);
	}
	
	public static void powerByExp (int number, int exponent) {
		int result = 1; 
		for (int i=0; i<exponent; i++) {
			result *= number;
		}
		System.out.println(number + "의" + exponent + "승은 " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// parameter , 전달 값 
		power(3); // argument 
		powerByExp(2,3); // 2  2 2 =8
		powerByExp(3,3); //
	}

}
