package chap_01;

public class typeCasting {

	public static void main(String[] args) {
		// type casting 형변환
		// 정수와 실수를 더하므로 형변환 필요.
		int score = 93;
		System.out.println(score);
		System.out.println((float)score);
		System.out.println((double)score);
		
		// float , double to int
		float score_f = 93.F;
		double score_d = 98.8;
		System.out.println((int) score_f);
		System.out.println((int) score_d);
		
		score = 93 + (int) 98.8;
		System.out.println(score);
		
		score_d = 93 + 98.8;  // 자동 형변환 93.0 + 98.0
		System.out.println(score_d);
		
		// 변수에 형변환된 데이터 집어넣기
		double convertScoreDouble  = score; // 191 -> 191.0
		//int -> long -> float -> double (자동 형변환) 
		
		int convertedScoreInt =(int) score_d; // 191.8 ->191
		// double -> float -> long ->int (수동 형변환)
		
		//숫자를 문자열로
		String s1 = String.valueOf(93);
		s1 = Integer.toString(93);
		System.out.println(s1);
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2);
		
		// 문자열을 숫자로
		int i = Integer.parseInt("93");
		System.out.println(i); // 93 
		double d = Double.parseDouble("98.8");
		
		int error = Integer.parseInt("java");
		
		
	}

}
