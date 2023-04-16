package chap_05;

public class _Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
		// 조건1. 신발 사이즈는 250부터 295까지 5단위로 증가
		// 조건2. 신발 사이즈 수느 ㄴ총 10가지.
		
		int[] size = new int[10];
		for (int i=0; i<size.length; i++) {
			size[i] = 250 + (5*i);
		}
		
		for (int s : size) {
			System.out.println("size " + s + " 재고0");
		}
	}

}
