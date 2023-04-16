package chap_04;

public class _01_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문 if 
		int hour = 15; //10 am 
		if ( hour < 14) {
			System.out.println("Ice coffee +1");
			System.out.println("Add shot");
		}
		System.out.println("Completed");
		//if 문 내에서 하나의 문장을 실행할 때는 중괄호 생략 가능. 
		//2개 이상의 문장은 중괄호 필수. 
		//////////////////////////////////////////////////////////////////
		
		//오후 2시 이전, 모닝 커피를 마시지 않은 경우. 
		hour = 10 ;
		boolean morningCoffee = false;
		if (hour <=14 && morningCoffee == false) // !morningCoffee 
		{
			System.out.println("Ice coffee + 1");
		}
		System.out.println("Completed #2");
		// 오후 2시 이후이거나 모닝 커피를 마신 경우 
		hour = 15;
		morningCoffee = true;
		if (hour >= 14 || morningCoffee) {
			System.out.println("디카페인 +1");
		}
		System.out.println("Completed #3");
	}

}
