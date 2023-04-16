package chap_03;

public class _03_StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 비교
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
		System.out.println(s1.equals("Java"));  //true 
		System.out.println(s2.equals("Python"));
		System.out.println(s2.equalsIgnoreCase("python"));  //대소문자 구분없이 출력. 
		//문자열 비교 심화 
		s1= "1234"; //벽에 붙은 메모지의 비밀번호 정보
		s2 = "1234";  //s1 과 s2 는 같은 곳을 참조 
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); //true 참조하는 곳이 같은지 확인
		
		s1 = new String("1234"); // s1과 s2 참조하는 곳이 다름. 
		s2 = new String("1234"); 
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); // false'
		
	}

}
