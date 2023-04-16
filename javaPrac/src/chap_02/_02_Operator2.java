package chap_02;

public class _02_Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입 연산자.  
		int num = 10 ;
		num-=2;
		num/=2;
		num%=3;
		System.out.println(num);
		
		//비교 연산자
		System.out.println(5 > 3);  //true
		
		//논리 연산자.
		boolean kimchi = true;
		boolean egg = false;
		boolean meat = true;
		
		System.out.println(kimchi || egg || meat); //하나라도 true이면 true (or) 
		System.out.println(kimchi && egg && meat); // 모두 true이어야 true (and)
		//논리 부정 연산자
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(5==5)); // false 
		
	}

}
