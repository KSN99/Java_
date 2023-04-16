package chap_06;

public class _01_Method {
	
	public static void sayHello() {
		System.out.println("Hello, This is method");
		//메소드 정의 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 (함수와 유사) 
		
		//메소드 호출 
		System.out.println("Before calling method");
		sayHello();
		sayHello();
		sayHello();
		System.out.println("After calling method");
		
	}

}
