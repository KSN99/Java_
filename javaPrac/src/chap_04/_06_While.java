package chap_04;

public class _06_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// While statement
		int distance = 25;
		int move = 0; // 현재 이동거리
		while (move < distance) {// 현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행.
			System.out.println("Keep moving");
			System.out.println("Current distance: "+ move);
			move += 3; // 3m moved 
		}
		System.out.println("Destination arrived");
		
		// 무한 루프 
		move = 0 ; 

	}

}
