package chap_03;

public class _04_EscapeSequence {
	public static void main(String [] args) {
		//escape Sequnce 
		// \n \t \\ \" \'
		System.out.println("Java");
		System.out.println("is");
		System.out.println("fun");
		System.out.println("java \n is \n fun");
		
		// fancake 9000 
		// kimchi 2000
		System.out.println("fancake\t8000");
		System.out.println("kimchi\t\t2000");
		// \t : tab
		
		System.out.println("C:\\program Files\\Java");
		
		//작은 따옴표가 필요할 때
		char c = 'A';
		c= '\'' ;  // 작은 따옴표 하나만 표현하고 싶을 때. 
	}
}
