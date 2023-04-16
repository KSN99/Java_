package chap_02;

public class _01_Operator1 {

	public static void main(String[] args) {
		//증감 연산자 ++ --
		int val;
		val = 10;
		System.out.println(val);
		System.out.println(++val);
		System.out.println(val++);
		
		val = 10;
		System.out.println(val);
		System.out.println(--val); //9
		System.out.println(val--); // 9 참조 후 8 됨. 
		
		//은행 대기번호 표 
		int waiting = 0;
		System.out.println("대기 인원: " + waiting++);
		System.out.println("대기 인원: " + waiting++);
		System.out.println("대기 인원: " + waiting++);
		
		
	}

}
