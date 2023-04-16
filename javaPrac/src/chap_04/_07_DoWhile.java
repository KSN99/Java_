package chap_04;

public class _07_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance = 25; //
		int move = 0 ; 
		int height = 2; // 2m 
		while (move + height < distance) {
			System.out.println("Keep moving");
			System.out.println("Current distance : " + move);
			move +=3;
		} System.out.println("Arrived.");
		
		//키가 엄청나게 큰 사람 
		move = 0 ;
		height = 25;
		System.out.println("반복문 #2");
		// Do While Statement
		do {
			System.out.println("keep moving");
			System.out.println("Current Distance : " + move);
			move +=3;
		} while (move + height < distance);
		System.out.println("Arrived");
	}

}
