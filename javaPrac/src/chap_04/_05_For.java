package chap_04;

public class _05_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for statement
		// 선언; 조건; 증감; 
		for (int i = 0; i< 10; i++) {
			System.out.println("Welcome to my house." +i);
		}
		
		// 짝수만 출력 //증감 조건을 i+=2로 변경.
		for (int i = 0; i<10 ; i++) {
			if (i%2==0)
			System.out.println(i);
		}
		// 거꾸로 숫자 출력. 
		for (int i=5; i>0; i--) {
			System.out.println(i);
		}
		
		// 1부터 10까지의 수들의 합
		int sum = 0;
		for (int i =1; i<=10; i++) {
			sum+=i;
		
		} System.out.println(sum);
	}

}
