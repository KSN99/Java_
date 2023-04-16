package chap_04;

public class _02_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// condition if / else
		
		int hour = 15; 
		if (hour <14) {
			System.out.println("Ice coffee +1");	
		}else { //그외의 경우 
			System.out.println("decaffein +1");
		}
		System.out.println("completed #1");
		//오후 2시 이후이거나 모닝 커피를 마신 경우 
		hour = 15;
		boolean morningCoffee = true;
		if (hour >= 14 || morningCoffee == true) {
			System.out.println("beverage +1");
			
		}
		
	}

}
