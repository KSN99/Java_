package chap_02;

public class _05_Operator5 {
	
	public static void main(String[] args) {
		
		//삼항 연산자 
        //		결과 = 조건 ? 참인_경우 결과값: 거짓인_경우_결과값
		int x = 5;
		int y = 3;
		int max  = (x>y) ? x:y;
		System.out.println(max);
		
		boolean b = (x==y) ? true:false;
		System.out.println(b);
		
		String s = (x!=y) ? "Different": "Same";
		System.out.println(s);
	}

}
