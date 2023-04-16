package chap_04;

public class _11_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Continue
		int max = 20; // 최대 치킨 판매 수량
		int sold = 0; 
		int noShow = 17;
		for (int i =1; i<=50; i++) {
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			if (i==noShow) {
				System.out.println("Skip");
				continue;
			}
			sold++;
			if(sold==max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
	}

}
