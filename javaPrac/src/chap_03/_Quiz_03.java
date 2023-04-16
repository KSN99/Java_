package chap_03;

public class _Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주민등록번호에서 생년월일 및 성별까지 출력.
		//주민등록 번호 13자리 
		//앞 6자리는 생년월일 / 뒷 7자리중 첫 번째 숫자는 성별 정보
		// 입력 데이터는 -을 포함한 14자리의 문자열 형태 
		// ex) "901231-1234567" 인경우 901231-1 까지 출력.  
		
		String idNumber = "901231-1234567";
		System.out.println(idNumber.substring(0,8));
	}

}
