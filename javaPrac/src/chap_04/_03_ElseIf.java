package chap_04;

public class _03_ElseIf {

	public static void main(String[] args) {
		// Condition ElseIF
		
		// orange drink +1
		// if not mango juice +1
		// ice coffee +1 
		boolean orangeDrink = true; 
		boolean mangoJuice = true;
		
		if (orangeDrink == true) {
			System.out.println("orange +1");
		} else if (mangoJuice) {
			System.out.println("mango +1");
		}
		else {
			System.out.println("Ice Coffee +1");
		}
		System.out.println("Completed");
		
		//else if can be used multiple times. 
	}

}
