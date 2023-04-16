package chap_06;

public class _03_Return {
	
	
	// Phone number of Hotel
	public static String getPhoneNumber() {
		String phoneNumber = "02-1234-5678";
		return phoneNumber;
	}
	// Hotel address 
	public static String getAddress() {
		return "somewhere in Seoul";
	}
	// Hotel activity
	
	public static String getActivity() {
		return "Bowling, table tennis, Garraoke"; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Return 반환 값 
		String contactNumber = getPhoneNumber();
		System.out.println("Phone number: "+contactNumber);
	
		String address = getAddress();
		System.out.println("Hotel address:  "+address);
	
		System.out.println("Activties: " + getActivity());
	}

}
