package chap_05;

public class _01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array : 같은 자료형의 값을 저장할 수 있는 연속된 값
		// 배열 선언 첫 번째 방법. 
		String[] coffees = new String[4];
		
		// 2
//		String coffees[] = new String
		coffees[0] = "아메리카노";
		coffees[1] = "아메리카노";
		coffees[2] = "아메리카노";
		coffees[3] = "아메리카노";
		
		//세 번째 방법 
		String[] coffee = new String[] {"아메리카노" , "카페모카", "라떼", "카푸치노"};
		
		//네 번째 방법
		String[] coffeess = {"1","2","3","4"};
		System.out.println(coffeess[0]+ "하나");
		System.out.println(coffeess[1]+ "하나");
	
		int[] i = new int[3];
		double[] d = new double[3];
 	}
}