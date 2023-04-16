package chap_01;

public class _Quiz_01 {

	public static void main(String[] args) {
		//버스 도착 정보
		String busNumber1="상암08";
		int restTime = 3;
		float distance = 1.2f;
		
		System.out.printf("%s%n번 버스", busNumber1);
		System.out.printf("약 %d%n분 후 도착",restTime);
		System.out.printf("남은 거리 %.1fkm", distance);
	}

}
