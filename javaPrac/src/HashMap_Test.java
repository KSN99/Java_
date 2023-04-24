package collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Test {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Put your ID and password");
			System.out.print("ID  ");
			String id = s.nextLine().trim();
			
			System.out.println("password:  ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!(map.containsKey(id))) {
				System.out.println("The Id does not exsist"+"try again");
				continue;
			}
			else {
				if(!(map.get(id)).equals(password)){
					System.out.println("password des not exsist");
				}else {
					System.out.println("Good");
					break;
				}
			}
		}
	
}
}
