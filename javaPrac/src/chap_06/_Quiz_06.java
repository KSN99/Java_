package chap_06;

public class _Quiz_06 {

	public static String getHiddenData(String data, int index) {
		String hiddenData = data.substring(0,index); // kim -> k 
		for (int i=0; i<data.length()-index; i++) {
			hiddenData += "*";
		}
		return hiddenData;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//개인정보를 비공개로 전환하는 메소드 작성
		// 하나의 메소드에서 모든 동작 처리
		// 각정보는 아래 ㅇ위치부터 비공개 적용
		String name = "Kim";
		String id = "990512-1082519";
		String phone = "010-8264-9808";
		
		System.out.println("Name: " + getHiddenData(name,1));
		System.out.println("id: " + getHiddenData(id,8));
		System.out.println("Phone: " + getHiddenData(phone,1));
	}

}
