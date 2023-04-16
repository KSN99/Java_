package chap_04;

public class _04_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch Case
		// first full semester
		// second half "
		// third  half "
		// else: none
		
		int ranking = 1; //first
		if (ranking == 1) {
			System.out.println("Full Semester");
		} else if (ranking ==2) {
			System.out.println("Half sem");
			
		} else if (ranking ==3) {
			System.out.println("Half");
		} else {
			System.out.println("None");
		} System.out.println("Checked");
		
		// Switch Case 
		// 스위치 사용하는 이유? 꼭 알아보기 . 
		ranking = 2; 
		switch (ranking) {
		case 1:
			System.out.println("Full");
			break;
		case 2: // 브레이크가 없으므로 다음문장 수행 (케이스 2,3 통합) 
		case 3:
			System.out.println("half");
			break;
		default:
			System.out.println("None");
				
		}System.out.println("Checked");
		
		//중고상품을 판매 한다고 가정 . (1급: 최상, 4급 : 최하 )  
		// 학점 구하는 프로그램에서도 유용 .
		int grade = 3; 
		int price = 7000; 
		switch (grade) {
		case 1:
			price += 1000;
		case 2:
			price += 1000;
		case 3:
			price += 1000;
			break;
		}
		System.out.println(grade + "price:" + price + "won");
	} 
	
}
