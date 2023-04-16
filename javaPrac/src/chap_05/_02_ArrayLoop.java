package chap_05;

public class _02_ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coffees = {"아메리카노", "카페모카", "라뗴", "카푸치노"};
		
		for (int i =0; i<4; i++) {
			System.out.println(coffees[i] + "하나");
			
		}System.out.println("plz");
		for (int i =0; i<coffees.length; i++) {
			System.out.println(coffees[i] + "하나");
	}
		
		//enhanced for (for-each) loop //for i in list
		for (String coffee : coffees) {
			System.out.println(coffee + "하나");
		}
}
}