package chap_04;

public class _Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주차 요금 정산 프로그램
		/*
		 -주차요금은 시간당 4000원 (일일 최대 3만원)
		 -경차 또는 장애인 차량은 최종 요금에서 50퍼 할인
		 일반 차량 5시간 주차시 20000원
		 경차 5시간 주차시 10000원
		 장애인 차량 10시간 주차시 15000원
		 */
		int hour = 5;
		int fee =hour * 4000;
		boolean normalCar =false; //경차
		boolean otherCar = true;  // 장애인 차량
		//30000원 초과시 일일 최대 요금으로 수정
		
		if (fee > 30000) {
			fee = 30000;
		}
		//경차 또는 장애인 차량 50퍼 할인 
		if (normalCar || otherCar) {
			fee /=2;
	}
		System.out.println("주차 요금은"+fee+"입니다.");
}
}


